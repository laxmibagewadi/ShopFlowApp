package com.example.shopping_flow.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.shopping_flow.R
import com.example.shopping_flow.model.Product

class ProductAdapter
    (private val context:Context,
     private val productlist:List<Product>):RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val imageHeart: ImageView = itemView.findViewById(R.id.imageHeart)
        val imageProduct: ImageView = itemView.findViewById(R.id.imageProduct)
        val textName: TextView = itemView.findViewById(R.id.titlename)
        val textInStock: TextView = itemView.findViewById(R.id.stock)
        val textDescription: TextView = itemView.findViewById(R.id.descripcation)
        val textSkinInfo: TextView = itemView.findViewById(R.id.skininfo)
        val textPriceCurrent: TextView = itemView.findViewById(R.id.currentprice)
        val textPriceOriginal: TextView = itemView.findViewById(R.id.actuallprice)
        val textReviewCount: TextView = itemView.findViewById(R.id.feedback)
        val imageCart: ImageView = itemView.findViewById(R.id.imageCart)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ProductViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.shop_adapter,parent,false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductAdapter.ProductViewHolder, position: Int) {

        val product = productlist[position]


        holder.imageProduct.setImageResource(product.productImageResId)


        holder.textName.text = product.name
        holder.textInStock.text = product.inStockText
        holder.textDescription.text = product.description
        holder.textSkinInfo.text = product.skinInfo
        holder.textPriceCurrent.text = product.priceCurrent
        holder.textPriceOriginal.text = product.priceOriginal


    }

    override fun getItemCount(): Int {
      return productlist.size
    }
}