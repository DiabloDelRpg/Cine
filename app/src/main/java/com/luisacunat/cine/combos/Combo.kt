package com.luisacunat.cine.combos

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "combos")
data class Combo(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val description: String? = null,
    val price: Double
)
