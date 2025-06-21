package com.example.supermarketmanager

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val category: String,
    val pricePerUnit: Double,
    val quantityAvailable: Int,
    val description: String,
    val offer: Boolean = false
)
