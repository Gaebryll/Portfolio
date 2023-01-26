package com.example.giftideas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.chip.ChipGroup

class AgeGrp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agegrp)

        val ageGroup: ChipGroup = findViewById(R.id.ageGroup)
        var age : Int = 0

        ageGroup.setOnCheckedChangeListener(){_, checkedId ->
            when(checkedId){
                R.id.infant -> age = 1
                R.id.adolescent -> age = 2
                R.id.adult -> age = 3
            }
            val intentThird = Intent(this, Gifts::class.java)
            intentThird.putExtra("ageValue", age)
            intentThird.putExtra("genValue", intent.extras?.getInt("genValue"))
            startActivity(intentThird)
        }
    }
}