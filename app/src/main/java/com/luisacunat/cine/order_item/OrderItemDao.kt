package com.luisacunat.cine.order_item

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface OrderItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: OrderItem): Long

    @Update
    suspend fun update(item: OrderItem)

    @Delete
    suspend fun delete(item: OrderItem)

    @Query("SELECT * FROM order_item WHERE id = :id")
    suspend fun getById(id: Long): OrderItem?

    @Query("SELECT * FROM order_item")
    fun getAll(): Flow<List<OrderItem>>

    @Query("SELECT * FROM order_item WHERE orderId = :orderId")
    fun getByOrder(orderId: Long): Flow<List<OrderItem>>
}
