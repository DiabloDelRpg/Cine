package com.luisacunat.cine.actors

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ActorDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Actor): Long

    @Update
    suspend fun update(item: Actor)

    @Delete
    suspend fun delete(item: Actor)

    @Query("SELECT * FROM actors WHERE id = :id")
    suspend fun getById(id: Long): Actor?

    @Query("SELECT * FROM actors")
    fun getAll(): Flow<List<Actor>>
}
