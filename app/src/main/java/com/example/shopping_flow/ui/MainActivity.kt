package com.example.shopping_flow.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopping_flow.R
import com.example.shopping_flow.adapter.Category
import com.example.shopping_flow.adapter.ProductAdapter
import com.example.shopping_flow.model.Product
import com.example.shopping_flow.model.ProductImage

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var horizontalRecyclerView: RecyclerView
    private lateinit var adapter: ProductAdapter
    private lateinit var adpater1:Category
    private lateinit var productList: List<Product>
    private lateinit var category: List<ProductImage>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recyclerview)
        horizontalRecyclerView = findViewById(R.id.hzrecycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        horizontalRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        // Prepare static product data
        productList = listOf(
            Product(
                name = "Glow",
                inStockText = "In stock",
                description = "French clay and algae-powered cleanser",
                skinInfo = "Skin Tightness • Dry & Dehydrated Skin",
                priceCurrent = "Rs. 355.20",
                priceOriginal = "Rs. 444.00",
                ratingStars = 5,
                reviewCount = 249,
                productImageResId = R.drawable.productimage,
                isFavorite = false
            ),
            Product(
                name = "Radiance",
                inStockText = "Out of stock",
                description = "Brightening serum with vitamin C",
                skinInfo = "For dull & tired skin",
                priceCurrent = "Rs. 499.00",
                priceOriginal = "Rs. 599.00",
                ratingStars = 4,
                reviewCount = 150,
                productImageResId = R.drawable.productimage, // add this drawable in your resources
                isFavorite = true
            )
            // Add more products if you want
        )

        adapter = ProductAdapter(this,productList)
        recyclerView.adapter = adapter

        category = listOf(
            ProductImage(name = "Glow",
                imageResId = R.drawable.productimage),
        ProductImage(name = "Glow",
            imageResId = R.drawable.productimage),
        ProductImage(name = "Glow",
            imageResId = R.drawable.productimage),
            ProductImage(name = "Glow",
                imageResId = R.drawable.productimage),
            ProductImage(name = "Glow",
                imageResId = R.drawable.productimage),
            ProductImage(name = "Glow",
                imageResId = R.drawable.productimage),
        )

        adpater1 = Category (this,category)
        horizontalRecyclerView.adapter = adpater1

    }

}