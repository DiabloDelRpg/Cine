package com.luisacunat.cine.movies

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class Movie(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val synopsis: String,
    val durationMinutes: Int,
    val rating: String,
    val genre: String,
    val releaseDate: String,
    val posterUrl: String? = null
)
