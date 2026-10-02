package com.luisacunat.cine.order_item

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.luisacunat.cine.combos.Combo
import com.luisacunat.cine.items.Item
import com.luisacunat.cine.orders.Order

@Entity(
    tableName = "order_item",
    foreignKeys = [
        ForeignKey(Order::class, ["id"], ["orderId"], onDelete = ForeignKey.CASCADE),
        ForeignKey(Item::class, ["id"], ["itemId"], onDelete = ForeignKey.SET_NULL),
        ForeignKey(Combo::class, ["id"], ["comboId"], onDelete = ForeignKey.SET_NULL)
    ],
    indices = [Index("orderId"), Index("itemId"), Index("comboId")]
)
data class OrderItem(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val orderId: Long,
    val itemId: Long? = null,
    val comboId: Long? = null,
    val quantity: Int,
    val unitPrice: Double
)
