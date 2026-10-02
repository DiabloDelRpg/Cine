package com.luisacunat.cine.movies

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Movie): Long

    @Update
    suspend fun update(item: Movie)

    @Delete
    suspend fun delete(item: Movie)

    @Query("SELECT * FROM movies WHERE id = :id")
    suspend fun getById(id: Long): Movie?

    @Query("SELECT * FROM movies")
    fun getAll(): Flow<List<Movie>>

    // pattern incluye los comodines, por ejemplo "%batman%"
    @Query("SELECT * FROM movies WHERE title LIKE :pattern")
    fun search(pattern: String): Flow<List<Movie>>
}
