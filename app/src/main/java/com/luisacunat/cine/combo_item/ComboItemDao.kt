package com.luisacunat.cine.combo_item

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ComboItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: ComboItem)

    @Delete
    suspend fun delete(item: ComboItem)

    @Query("SELECT * FROM combo_item")
    fun getAll(): Flow<List<ComboItem>>

    @Query("SELECT * FROM combo_item WHERE comboId = :comboId")
    fun getByCombo(comboId: Long): Flow<List<ComboItem>>
}
