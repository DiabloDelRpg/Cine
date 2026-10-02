package com.luisacunat.cine.movie_actor

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import com.luisacunat.cine.actors.Actor
import com.luisacunat.cine.movies.Movie

@Entity(
    tableName = "movie_actor",
    primaryKeys = ["movieId", "actorId"],
    foreignKeys = [
        ForeignKey(Movie::class, ["id"], ["movieId"], onDelete = ForeignKey.CASCADE),
        ForeignKey(Actor::class, ["id"], ["actorId"], onDelete = ForeignKey.CASCADE)
    ],
    indices = [Index("actorId")]
)
data class MovieActor(
    val movieId: Long,
    val actorId: Long,
    val characterName: String? = null
)
