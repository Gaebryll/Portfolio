package com.example.dayoftheweek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dayBtn = findViewById<Button>(R.id.dayBtn)
        var inputDay = findViewById<EditText>(R.id.inputDay)

        dayBtn.setOnClickListener {

            val stg = inputDay.text.toString().toIntOrNull()

            if (stg != null) {

                val mainIntent = Intent(this, DayView::class.java)
                mainIntent.putExtra("numDay", stg)
                startActivity(mainIntent)
            }
        }
    }
}