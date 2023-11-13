package com.example.myapplication

import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.RenderEffect
import android.graphics.Shader
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityAudioPlayerBinding

class AudioPlayer : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer;
    private var handler = Handler(Looper.getMainLooper())

    private val binding by lazy {
        ActivityAudioPlayerBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            binding.imageBackground.setRenderEffect(RenderEffect.createBlurEffect(40.toFloat(), 40.toFloat(), Shader.TileMode.MIRROR))
            binding.imageBackground.setColorFilter(Color.argb(200, 0, 0, 0), PorterDuff.Mode.SRC_OVER)
        };
        mediaPlayer = MediaPlayer.create(this, R.raw.music)
        binding.seekBar?.max = mediaPlayer?.duration ?: 0
        binding.buttonPlayer.setOnClickListener {
            if (mediaPlayer?.isPlaying == true) {
                mediaPlayer?.pause()
                binding.imageButtonPlayer.setImageResource(R.drawable.play)
            } else {
                mediaPlayer?.start()
                binding.imageButtonPlayer.setImageResource(R.drawable.pause)
                updateSeekBar()
            }
        }
        binding.seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                println(progress);
                println(mediaPlayer.duration);
                if (fromUser) {
                    mediaPlayer?.seekTo(progress) // Converte de segundos para milissegundos
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        binding.buttonPrev.setOnClickListener {
            finish()
        }
    }

    private fun updateSeekBar() {
        mediaPlayer?.let {
            binding.seekBar?.progress = it.currentPosition
            handler.postDelayed({
                updateSeekBar()
            }, 1000) // Atualiza a cada segundo
        }
    }
}