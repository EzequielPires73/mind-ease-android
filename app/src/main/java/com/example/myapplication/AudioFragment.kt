package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import models.CollectionFile

class AudioFragment(val audios: List<CollectionFile>?) : Fragment() {
    private lateinit var rv_audios: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_audio, container, false)

        rv_audios = view.findViewById(R.id.rv_audios);
        rv_audios.adapter = CollectionFileAdapter(audios ?: listOf())
        rv_audios.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL,false)

        return view;
    }
}