package com.luisacunat.cine.directors

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "directors")
data class Director(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val nationality: String? = null,
    val birthDate: String? = null
)
