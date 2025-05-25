package com.example.shopping_flow.model

data class Product(
    val name: String,
    val inStockText: String,
    val description: String,
    val skinInfo: String,
    val priceCurrent: String,
    val priceOriginal: String,
    val ratingStars: Int,
    val reviewCount: Int,
    val productImageResId: Int,
    val isFavorite: Boolean = false
)
