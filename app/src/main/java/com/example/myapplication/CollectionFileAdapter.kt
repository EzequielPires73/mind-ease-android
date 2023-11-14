package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import models.CollectionFile
import models.CollectionFileType

class CollectionFileAdapter(private val files: List<CollectionFile>): Adapter<CollectionFileAdapter.CollectionFileViewHolder>() {
    inner class CollectionFileViewHolder(private val view: View): ViewHolder(view) {
        val card: CardView = view.findViewById(R.id.cardFile);
        val title: TextView = view.findViewById(R.id.titleCardFile);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionFileViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context);
        val view = layoutInflater.inflate(R.layout.card_file, parent, false);
        return  CollectionFileViewHolder(view);
    }

    override fun getItemCount(): Int {
        return files.size
    }

    override fun onBindViewHolder(holder: CollectionFileViewHolder, position: Int) {
        holder.card.setOnClickListener {
            val intent = if (files[position].type == CollectionFileType.audio) {
                Intent(holder.card.context, AudioPlayer::class.java)
            } else {
                Intent(holder.card.context, VideoPlayerActivity::class.java)
            }
            holder.card.context.startActivity(intent)
        }
        holder.title.text = files[position].name;
    }
}