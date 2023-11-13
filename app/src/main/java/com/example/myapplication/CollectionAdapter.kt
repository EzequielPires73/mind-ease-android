package com.example.myapplication

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import models.Collection

class CollectionAdapter(private val collections: List<Collection>): Adapter<CollectionAdapter.CollectionViewHolder>() {
    inner class CollectionViewHolder(private val view: View): ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.card_collections_name);
        val card: ConstraintLayout = view.findViewById(R.id.card_collection);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context);
        val view = layoutInflater.inflate(R.layout.card_collection, parent, false);
        return  CollectionViewHolder(view);
    }

    override fun getItemCount(): Int {
        return collections.size;
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.name.text = collections[position].name;

        fun showAlertDialog() {
            val alertDialogBuilder = AlertDialog.Builder(holder.card.context)
            val layoutInflater = LayoutInflater.from(holder.card.context)
            val dialogView = layoutInflater.inflate(R.layout.tab_modal_collection, null)
            val tab = dialogView.findViewById<TabLayout>(R.id.tabCollection)
            val view = dialogView.findViewById<ViewPager2>(R.id.tabCollectionView)

            view.adapter = VPAdapter(holder.card.context as FragmentActivity);
            TabLayoutMediator(tab, view) {
                tab, position -> when(position) {
                    0 -> tab.text = "Áudios"
                    1 -> tab.text = "Vídeos"
                }
            }.attach()

            alertDialogBuilder.setView(dialogView)
            // Set the title and message for the AlertDialog
            alertDialogBuilder.setTitle("Alert Title")
            alertDialogBuilder.setMessage("This is the alert message.")

            // Set positive button and its click listener
            alertDialogBuilder.setPositiveButton("OK") { dialog, which ->
                // Handle positive button click
                // You can perform some action here
            }

            // Set negative button and its click listener
            alertDialogBuilder.setNegativeButton("Cancel") { dialog, which ->
                // Handle negative button click
                // You can perform some action here, or simply close the dialog
                dialog.dismiss()
            }

            // Create and show the AlertDialog
            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }

        holder.card.setOnClickListener {
            showAlertDialog()
        }
    }


}