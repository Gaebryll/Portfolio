package com.example.DayoftheWeek

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class DayView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day_view)

        val dayNum = intent.getIntExtra("dayInput", 0)
        var nameDay = findViewById<TextView>(R.id.dayName)
        var backg = findViewById<View>(R.id.viewBg)

        val color = when (dayNum){

            1 -> Color.parseColor("#0000FF")
            2 -> Color.parseColor("#00FF00")
            3 -> Color.parseColor("#00FFFF")
            4 -> Color.parseColor("#FF0000")
            5 -> Color.parseColor("#FF00FF")
            6 -> Color.parseColor("#FFFF00")
            7 -> Color.parseColor("#FFFFFF")

            else -> Color.parseColor("#000000")
        }

        if (dayNum in 1..7)
            nameDay.text = resources.getStringArray(R.array.dayDisplay)[dayNum-1]

        backg.setBackgroundColor(color)
    }
}