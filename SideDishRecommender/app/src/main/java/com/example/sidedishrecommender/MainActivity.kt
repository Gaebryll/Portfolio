package com.example.sidedishrecommender

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dishImg = findViewById<ImageView>(R.id.sidePic)
        val dishText = findViewById<TextView>(R.id.sideText)
        val chipGroup = findViewById<ChipGroup>(R.id.chipGroup)

        chipGroup.setOnCheckedChangeListener { _, checkedId ->
            var img = when (checkedId) {
                R.id.burger -> R.drawable.onionrings
                R.id.pasta -> R.drawable.cheesygarlicbread
                R.id.chicken -> R.drawable.rice

                else -> R.drawable.transparent
            }

            var txt = when (checkedId) {
                R.id.burger -> "Onion Rings"
                R.id.pasta -> "Cheesy Garlic Bread"
                R.id.chicken -> "White Rice"

                else -> "Recommended Dish:"
            }

            dishImg.setImageResource(img)
            dishText.text = txt
        }
    }
}