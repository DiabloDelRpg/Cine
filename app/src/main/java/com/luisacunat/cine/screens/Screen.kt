package com.luisacunat.cine.screens

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.luisacunat.cine.branches.Branch

@Entity(
    tableName = "screens",
    foreignKeys = [
        ForeignKey(Branch::class, ["id"], ["branchId"], onDelete = ForeignKey.CASCADE)
    ],
    indices = [Index("branchId")]
)
data class Screen(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val branchId: Long,
    val name: String,
    val capacity: Int,
    val type: String
)
