package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import models.Collection
import models.CollectionFileType

class VPAdapter(fa: FragmentActivity, val collection: Collection): FragmentStateAdapter(fa) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return  when(position) {
            0 -> AudioFragment(collection.files?.filter { it.type == CollectionFileType.audio })
            1 -> VideoFragment(collection.files?.filter { it.type == CollectionFileType.video })
            else -> AudioFragment(collection.files?.filter { it.type == CollectionFileType.audio })
        }
    }
}