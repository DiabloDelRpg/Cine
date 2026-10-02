package com.luisacunat.cine.orders

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.luisacunat.cine.users.User

@Entity(
    tableName = "orders",
    foreignKeys = [
        ForeignKey(User::class, ["id"], ["userId"], onDelete = ForeignKey.CASCADE)
    ],
    indices = [Index("userId")]
)
data class Order(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val userId: Long,
    val createdAt: String,
    val total: Double,
    val status: String = "PENDING"
)
