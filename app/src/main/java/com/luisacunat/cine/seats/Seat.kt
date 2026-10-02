package com.luisacunat.cine.seats

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.luisacunat.cine.screens.Screen

@Entity(
    tableName = "seats",
    foreignKeys = [
        ForeignKey(Screen::class, ["id"], ["screenId"], onDelete = ForeignKey.CASCADE)
    ],
    indices = [Index("screenId")]
)
data class Seat(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val screenId: Long,
    val rowLabel: String,
    val number: Int,
    val type: String = "STANDARD"
)
