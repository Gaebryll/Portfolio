package com.example.DayoftheWeek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dayShow = findViewById<Button>(R.id.dayBtn)
        var inputNum = findViewById<EditText>(R.id.inputDay)

        dayShow.setOnClickListener {
            val num = inputNum.text.toString().toIntOrNull()

            if (num != null){
                val newIntent = Intent(this, DayView::class.java)
                newIntent.putExtra("dayInput", num)
                startActivity(newIntent)
            }
        }


    }
}