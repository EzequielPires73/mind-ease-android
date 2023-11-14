package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import models.CollectionFile

class VideoFragment(val videos: List<CollectionFile>?) : Fragment() {
    private lateinit var rv_videos: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_video, container, false)

        rv_videos = view.findViewById(R.id.rvVideos)
        rv_videos.adapter = CollectionFileAdapter(videos ?: listOf())
        rv_videos.layoutManager = LinearLayoutManager(view.context)

        return view
    }
}