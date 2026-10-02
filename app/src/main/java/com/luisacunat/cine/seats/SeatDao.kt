package com.luisacunat.cine.seats

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface SeatDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Seat): Long

    @Update
    suspend fun update(item: Seat)

    @Delete
    suspend fun delete(item: Seat)

    @Query("SELECT * FROM seats WHERE id = :id")
    suspend fun getById(id: Long): Seat?

    @Query("SELECT * FROM seats")
    fun getAll(): Flow<List<Seat>>

    @Query("SELECT * FROM seats WHERE screenId = :screenId")
    fun getByScreen(screenId: Long): Flow<List<Seat>>
}
