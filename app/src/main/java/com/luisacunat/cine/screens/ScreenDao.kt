package com.luisacunat.cine.screens

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ScreenDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Screen): Long

    @Update
    suspend fun update(item: Screen)

    @Delete
    suspend fun delete(item: Screen)

    @Query("SELECT * FROM screens WHERE id = :id")
    suspend fun getById(id: Long): Screen?

    @Query("SELECT * FROM screens")
    fun getAll(): Flow<List<Screen>>

    @Query("SELECT * FROM screens WHERE branchId = :branchId")
    fun getByBranch(branchId: Long): Flow<List<Screen>>
}
