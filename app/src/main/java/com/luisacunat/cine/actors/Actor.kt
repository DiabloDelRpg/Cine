package com.luisacunat.cine.actors

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "actors")
data class Actor(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val nationality: String? = null,
    val birthDate: String? = null
)
