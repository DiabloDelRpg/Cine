package com.luisacunat.cine.movie_director

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import com.luisacunat.cine.directors.Director
import com.luisacunat.cine.movies.Movie

@Entity(
    tableName = "movie_director",
    primaryKeys = ["movieId", "directorId"],
    foreignKeys = [
        ForeignKey(Movie::class, ["id"], ["movieId"], onDelete = ForeignKey.CASCADE),
        ForeignKey(Director::class, ["id"], ["directorId"], onDelete = ForeignKey.CASCADE)
    ],
    indices = [Index("directorId")]
)
data class MovieDirector(
    val movieId: Long,
    val directorId: Long
)
