package com.luisacunat.cine.showtimes

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.luisacunat.cine.movies.Movie
import com.luisacunat.cine.screens.Screen

@Entity(
    tableName = "showtimes",
    foreignKeys = [
        ForeignKey(Movie::class, ["id"], ["movieId"], onDelete = ForeignKey.CASCADE),
        ForeignKey(Screen::class, ["id"], ["screenId"], onDelete = ForeignKey.CASCADE)
    ],
    indices = [Index("movieId"), Index("screenId")]
)
data class Showtime(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val movieId: Long,
    val screenId: Long,
    val startTime: String,
    val endTime: String,
    val price: Double
)
