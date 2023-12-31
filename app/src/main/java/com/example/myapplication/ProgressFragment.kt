package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import repositories.CategoryRepository

class ProgressFragment : Fragment() {
    private lateinit var rvCollectionsProgress: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_progress, container, false)

        val subcategories = CategoryRepository().categories[0].subcategories;
        rvCollectionsProgress = view.findViewById(R.id.rv_collections_progress)
        rvCollectionsProgress.adapter = ProgressAdapter(subcategories ?: emptyList())

        return view
    }

    companion object {
    }
}