package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar.LayoutParams
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginLeft
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import models.Subcategory

class ProgressAdapter(private val subcategories: List<Subcategory>) :
    Adapter<ProgressAdapter.ProgressViewHolder>() {
    inner class ProgressViewHolder(private val view: View) : ViewHolder(view) {
        val card: ConstraintLayout = view.findViewById(R.id.card_progress)
        val name: TextView = view.findViewById(R.id.card_progress_name)
        val image: ImageView = view.findViewById(R.id.card_progress_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgressViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.card_progress, parent, false)

        return ProgressViewHolder(view)
    }

    override fun getItemCount(): Int {
        return subcategories.size
    }

    override fun onBindViewHolder(holder: ProgressViewHolder, position: Int) {
        val subcategory = subcategories[position]
        holder.name.text = subcategory.name
        val resourceId = holder.image.context.resources.getIdentifier(subcategory.image, "drawable", holder.image.context.packageName)
        holder.image.setImageResource(resourceId)
        if (position == 0) {
            val layoutParams = holder.card.layoutParams as ViewGroup.MarginLayoutParams
            layoutParams.leftMargin = 64
            holder.card.layoutParams = layoutParams
        }
    }
}