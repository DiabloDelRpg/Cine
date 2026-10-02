package com.luisacunat.cine.directors

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface DirectorDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Director): Long

    @Update
    suspend fun update(item: Director)

    @Delete
    suspend fun delete(item: Director)

    @Query("SELECT * FROM directors WHERE id = :id")
    suspend fun getById(id: Long): Director?

    @Query("SELECT * FROM directors")
    fun getAll(): Flow<List<Director>>
}
