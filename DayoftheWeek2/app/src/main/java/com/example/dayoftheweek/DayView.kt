package com.example.dayoftheweek

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DayView : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day_view)

        val numDay = intent.getIntExtra("numDay", 0)
        var weekDay = findViewById<TextView>(R.id.weekDay)
        var colorBG = findViewById<View>(R.id.colorBG)

        val color = when (numDay){
            1 -> Color.parseColor("#0000FF")
            2 -> Color.parseColor("#00FF00")
            3 -> Color.parseColor("#00FFFF")
            4 -> Color.parseColor("#FF0000")
            5 -> Color.parseColor("#FF00FF")
            6 -> Color.parseColor("#FFFF00")
            7 -> Color.parseColor("#FFFFFF")

            else -> Color.parseColor("#000000")
        }

        if(numDay in 1..7)
            weekDay.text = resources.getStringArray(R.array.day_names)[numDay-1]

        colorBG.setBackgroundColor(color)
    }
}