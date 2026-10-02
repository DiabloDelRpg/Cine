package com.luisacunat.cine.orders

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface OrderDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Order): Long

    @Update
    suspend fun update(item: Order)

    @Delete
    suspend fun delete(item: Order)

    @Query("SELECT * FROM orders WHERE id = :id")
    suspend fun getById(id: Long): Order?

    @Query("SELECT * FROM orders")
    fun getAll(): Flow<List<Order>>

    @Query("SELECT * FROM orders WHERE userId = :userId")
    fun getByUser(userId: Long): Flow<List<Order>>
}
