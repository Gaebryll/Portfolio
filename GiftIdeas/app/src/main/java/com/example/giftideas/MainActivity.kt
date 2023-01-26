package com.example.giftideas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.chip.ChipGroup


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val genderGroup: ChipGroup = findViewById(R.id.genderGroup)
        var gender: Int = 0

        genderGroup.setOnCheckedChangeListener{_, checkedID ->
            when(checkedID){
                R.id.male -> gender = 1
                R.id.female -> gender = 2
            }
            val intentNext = Intent(this, AgeGrp::class.java)
            intentNext.putExtra("genValue", gender)
            startActivity(intentNext)
        }
    }
}