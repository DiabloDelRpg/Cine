package com.luisacunat.cine.combo_item

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import com.luisacunat.cine.combos.Combo
import com.luisacunat.cine.items.Item

@Entity(
    tableName = "combo_item",
    primaryKeys = ["comboId", "itemId"],
    foreignKeys = [
        ForeignKey(Combo::class, ["id"], ["comboId"], onDelete = ForeignKey.CASCADE),
        ForeignKey(Item::class, ["id"], ["itemId"], onDelete = ForeignKey.CASCADE)
    ],
    indices = [Index("itemId")]
)
data class ComboItem(
    val comboId: Long,
    val itemId: Long,
    val quantity: Int = 1
)
