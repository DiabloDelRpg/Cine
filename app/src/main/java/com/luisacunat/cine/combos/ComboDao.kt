package com.luisacunat.cine.combos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ComboDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Combo): Long

    @Update
    suspend fun update(item: Combo)

    @Delete
    suspend fun delete(item: Combo)

    @Query("SELECT * FROM combos WHERE id = :id")
    suspend fun getById(id: Long): Combo?

    @Query("SELECT * FROM combos")
    fun getAll(): Flow<List<Combo>>
}
