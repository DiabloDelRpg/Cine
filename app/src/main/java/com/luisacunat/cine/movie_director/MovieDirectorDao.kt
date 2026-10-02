package com.luisacunat.cine.movie_director

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDirectorDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: MovieDirector)

    @Delete
    suspend fun delete(item: MovieDirector)

    @Query("SELECT * FROM movie_director")
    fun getAll(): Flow<List<MovieDirector>>

    @Query("SELECT * FROM movie_director WHERE movieId = :movieId")
    fun getByMovie(movieId: Long): Flow<List<MovieDirector>>
}
