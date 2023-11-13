package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.myapplication.databinding.ActivityAudioPlayerBinding
import com.example.myapplication.databinding.ActivityVideoPlayerBinding

class VideoPlayerActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityVideoPlayerBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)

        binding.videoView.setMediaController(mediaController)
        binding.videoView.setVideoURI(Uri.parse("android.resource://${packageName}/${R.raw.video}"))
    }
}