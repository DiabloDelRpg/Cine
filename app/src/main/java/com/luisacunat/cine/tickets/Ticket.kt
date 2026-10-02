package com.luisacunat.cine.tickets

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.luisacunat.cine.orders.Order
import com.luisacunat.cine.seats.Seat
import com.luisacunat.cine.showtimes.Showtime

@Entity(
    tableName = "tickets",
    foreignKeys = [
        ForeignKey(Showtime::class, ["id"], ["showtimeId"], onDelete = ForeignKey.CASCADE),
        ForeignKey(Seat::class, ["id"], ["seatId"], onDelete = ForeignKey.CASCADE),
        ForeignKey(Order::class, ["id"], ["orderId"], onDelete = ForeignKey.CASCADE)
    ],
    indices = [Index(value = ["showtimeId", "seatId"], unique = true), Index("seatId"), Index("orderId")]
)
data class Ticket(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val showtimeId: Long,
    val seatId: Long,
    val orderId: Long,
    val price: Double
)
