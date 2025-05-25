package com.example.shopping_flow.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopping_flow.R
import com.example.shopping_flow.model.ProductImage

class Category(private  val context:Context,
               private val categories: List<ProductImage>
): RecyclerView.Adapter<Category.CategoryViewHolder>()  {
    inner class CategoryViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.imageViewCategory)
        val textView: TextView = itemView.findViewById(R.id.textViewCategoryName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Category.CategoryViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.horizontal, parent, false)
        return CategoryViewHolder(view)    }

    override fun onBindViewHolder(holder: Category.CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.textView.text = category.name
        holder.imageView.setImageResource(category.imageResId)
    }

    override fun getItemCount(): Int {
     return categories.size
    }
}