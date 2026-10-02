package com.luisacunat.cine.showtimes

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ShowtimeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Showtime): Long

    @Update
    suspend fun update(item: Showtime)

    @Delete
    suspend fun delete(item: Showtime)

    @Query("SELECT * FROM showtimes WHERE id = :id")
    suspend fun getById(id: Long): Showtime?

    @Query("SELECT * FROM showtimes")
    fun getAll(): Flow<List<Showtime>>

    @Query("SELECT * FROM showtimes WHERE movieId = :movieId")
    fun getByMovie(movieId: Long): Flow<List<Showtime>>
}
