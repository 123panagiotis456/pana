package com.example.supermarketmanager

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish_list")
data class WishListItem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val productId: Int
)
