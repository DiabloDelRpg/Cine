package com.luisacunat.cine.movie_actor

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieActorDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: MovieActor)

    @Delete
    suspend fun delete(item: MovieActor)

    @Query("SELECT * FROM movie_actor")
    fun getAll(): Flow<List<MovieActor>>

    @Query("SELECT * FROM movie_actor WHERE movieId = :movieId")
    fun getByMovie(movieId: Long): Flow<List<MovieActor>>
}
