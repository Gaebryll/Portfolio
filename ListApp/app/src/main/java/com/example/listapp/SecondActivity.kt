package com.example.listapp

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = intent.getStringExtra("list")
        val titleShounen = intent.getStringExtra("title")
        val dateShounen = intent.getStringExtra("date")
        val imageShounen = intent.getIntExtra("image", R.drawable.aot)
        val ratingShounen = intent.getFloatExtra("rate", 8.53F)
        val episodesShounen = intent.getIntExtra("eps", 25)
        val premieredShounen = intent.getStringExtra("premier")
        val studioShounen = intent.getStringExtra("studio")
        val durationShounen = intent.getStringExtra("duration")
        val synopsisShounen = intent.getStringExtra("synopsis")

        val titleShoujo = intent.getStringExtra("title2")
        val dateShoujo = intent.getStringExtra("date2")
        val imageShoujo = intent.getIntExtra("image2", R.drawable.aoharuride)
        val ratingShoujo = intent.getFloatExtra("rate2", 7.65F)
        val episodesShoujo = intent.getIntExtra("eps2", 12)
        val premieredShoujo = intent.getStringExtra("premier2")
        val studioShoujo = intent.getStringExtra("studio2")
        val durationShoujo = intent.getStringExtra("duration2")
        val synopsisShoujo = intent.getStringExtra("synopsis2")

        val arcade = MediaPlayer.create(this, R.raw.arcade)
        val video = MediaPlayer.create(this, R.raw.video)

        if (list == "listShounen") {
            video?.start()

            binding.animeTitle.text = titleShounen
            binding.aired.text = dateShounen
            binding.imageView2.setImageResource(imageShounen)
            binding.rating.text = ratingShounen.toString()
            binding.episodes.text = episodesShounen.toString()
            binding.premiered.text = premieredShounen
            binding.studio.text = studioShounen
            binding.duration.text = durationShounen
            binding.genre.text = "Shounen"
            binding.synopsis.text = synopsisShounen + "\n"
        }
        else if (list == "listShoujo"){
            video?.start()

            binding.animeTitle.text = titleShoujo
            binding.aired.text = dateShoujo
            binding.imageView2.setImageResource(imageShoujo)
            binding.rating.text = ratingShoujo.toString()
            binding.episodes.text = episodesShoujo.toString()
            binding.premiered.text = premieredShoujo
            binding.studio.text = studioShoujo
            binding.duration.text = durationShoujo
            binding.genre.text = "Shoujo"
            binding.synopsis.text = synopsisShoujo + "\n"
        }

        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            arcade?.start()
            startActivity(intent)
        }

    }
}