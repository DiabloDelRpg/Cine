package com.luisacunat.cine.tickets

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TicketDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Ticket): Long

    @Update
    suspend fun update(item: Ticket)

    @Delete
    suspend fun delete(item: Ticket)

    @Query("SELECT * FROM tickets WHERE id = :id")
    suspend fun getById(id: Long): Ticket?

    @Query("SELECT * FROM tickets")
    fun getAll(): Flow<List<Ticket>>

    @Query("SELECT * FROM tickets WHERE showtimeId = :showtimeId")
    fun getByShowtime(showtimeId: Long): Flow<List<Ticket>>

    @Query("SELECT * FROM tickets WHERE orderId = :orderId")
    fun getByOrder(orderId: Long): Flow<List<Ticket>>
}
