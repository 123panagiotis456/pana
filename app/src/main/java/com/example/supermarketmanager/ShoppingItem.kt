package com.example.supermarketmanager

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val productId: Int,
    val quantity: Int,
    val purchased: Boolean = false
)
