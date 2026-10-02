package com.luisacunat.cine.branches

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface BranchDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Branch): Long

    @Update
    suspend fun update(item: Branch)

    @Delete
    suspend fun delete(item: Branch)

    @Query("SELECT * FROM branches WHERE id = :id")
    suspend fun getById(id: Long): Branch?

    @Query("SELECT * FROM branches")
    fun getAll(): Flow<List<Branch>>
}
