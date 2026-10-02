package com.luisacunat.cine

import androidx.room.Database
import androidx.room.RoomDatabase
import com.luisacunat.cine.actors.Actor
import com.luisacunat.cine.actors.ActorDao
import com.luisacunat.cine.branches.Branch
import com.luisacunat.cine.branches.BranchDao
import com.luisacunat.cine.combo_item.ComboItem
import com.luisacunat.cine.combo_item.ComboItemDao
import com.luisacunat.cine.combos.Combo
import com.luisacunat.cine.combos.ComboDao
import com.luisacunat.cine.directors.Director
import com.luisacunat.cine.directors.DirectorDao
import com.luisacunat.cine.items.Item
import com.luisacunat.cine.items.ItemDao
import com.luisacunat.cine.movie_actor.MovieActor
import com.luisacunat.cine.movie_actor.MovieActorDao
import com.luisacunat.cine.movie_director.MovieDirector
import com.luisacunat.cine.movie_director.MovieDirectorDao
import com.luisacunat.cine.movies.Movie
import com.luisacunat.cine.movies.MovieDao
import com.luisacunat.cine.order_item.OrderItem
import com.luisacunat.cine.order_item.OrderItemDao
import com.luisacunat.cine.orders.Order
import com.luisacunat.cine.orders.OrderDao
import com.luisacunat.cine.screens.Screen
import com.luisacunat.cine.screens.ScreenDao
import com.luisacunat.cine.seats.Seat
import com.luisacunat.cine.seats.SeatDao
import com.luisacunat.cine.showtimes.Showtime
import com.luisacunat.cine.showtimes.ShowtimeDao
import com.luisacunat.cine.tickets.Ticket
import com.luisacunat.cine.tickets.TicketDao
import com.luisacunat.cine.users.User
import com.luisacunat.cine.users.UserDao

@Database(
    entities = [
        Movie::class, Director::class, Actor::class, MovieDirector::class, MovieActor::class,
        Branch::class, Screen::class, Seat::class, Showtime::class, Ticket::class,
        Item::class, Combo::class, ComboItem::class, User::class, Order::class, OrderItem::class
    ],
    version = 1,
    exportSchema = false
)
abstract class CineDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun directorDao(): DirectorDao
    abstract fun actorDao(): ActorDao
    abstract fun movieDirectorDao(): MovieDirectorDao
    abstract fun movieActorDao(): MovieActorDao
    abstract fun branchDao(): BranchDao
    abstract fun screenDao(): ScreenDao
    abstract fun seatDao(): SeatDao
    abstract fun showtimeDao(): ShowtimeDao
    abstract fun ticketDao(): TicketDao
    abstract fun itemDao(): ItemDao
    abstract fun comboDao(): ComboDao
    abstract fun comboItemDao(): ComboItemDao
    abstract fun userDao(): UserDao
    abstract fun orderDao(): OrderDao
    abstract fun orderItemDao(): OrderItemDao
}
