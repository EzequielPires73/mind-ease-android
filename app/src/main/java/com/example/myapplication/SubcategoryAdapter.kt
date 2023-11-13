package com.example.myapplication

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import models.Subcategory

class SubcategoryAdapter(private val subcategories: List<Subcategory>, private val color: Int): Adapter<SubcategoryAdapter.SubcategoryViewHolder>() {
    inner class SubcategoryViewHolder(private val view: View): ViewHolder(view) {
        val name: TextView = if(subcategories.size > 1) view.findViewById(R.id.list_car_category_name) else view.findViewById(R.id.card_category_full_name)
        val image: ImageView = if(subcategories.size > 1) view.findViewById(R.id.list_car_category_image) else view.findViewById(R.id.card_category_full_image)
        val quantity: TextView = if(subcategories.size > 1) view.findViewById(R.id.list_car_category_quantity) else view.findViewById(R.id.card_category_full_quantity)
        val card: ConstraintLayout = if(subcategories.size > 1) view.findViewById(R.id.list_card_category) else view.findViewById(R.id.card_category_full)
        val cardView: CardView = if(subcategories.size > 1) view.findViewById(R.id.card_item) else view.findViewById(R.id.card_item_full)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubcategoryViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = if(subcategories.size > 1) layoutInflater.inflate(R.layout.list_card_category, parent, false) else layoutInflater.inflate(R.layout.card_category_full, parent, false)

        return SubcategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return subcategories.size
    }

    override fun onBindViewHolder(holder: SubcategoryViewHolder, position: Int) {
        val subcategory = subcategories[position]
        holder.name.text = subcategory.name
        val resourceId = holder.image.context.resources.getIdentifier(subcategory.image, "drawable", holder.image.context.packageName)
        holder.image.setImageResource(resourceId)
        holder.quantity.text = "5 seções"
        if(position == 0 && subcategories.size > 1) {
            val layoutParams = holder.card.layoutParams as ViewGroup.MarginLayoutParams
            layoutParams.leftMargin = 48
            holder.card.layoutParams = layoutParams
        }
        if(color != null) {
            val colorTint = ContextCompat.getColor(holder.cardView.context, color)
            val colorTintList = ColorStateList.valueOf(colorTint)
            if(color != null) holder.cardView.backgroundTintList = colorTintList
        }
        holder.card.setOnClickListener {
            val intent = Intent(holder.card.context, CategoryActivity::class.java)
            intent.putExtra("subcategory", subcategories[position])
            holder.card.context.startActivity(intent)
        }
    }
}