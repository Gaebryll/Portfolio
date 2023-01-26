package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.bmicalculator.databinding.ActivityMainBinding
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factor:TextView = findViewById(R.id.factor)
        val evaluation:TextView = findViewById(R.id.evaluation)
        val imgeval: ImageView = findViewById(R.id.imgeval)

        binding.evalbtn.setOnClickListener(View.OnClickListener {
            if(!binding.weight.text.isEmpty() && !binding.height.text.isEmpty())
            {
                var bmi = binding.weight.text.toString().toFloat() / binding.height.text.toString()
                    .toFloat().pow(2)
                factor.text = "%.2f".format(bmi)

                if (bmi <= 18.5)
                {
                    evaluation.text = "UNDERWEIGHT"
                    imgeval.setImageResource(R.drawable.under)
                }

                else if(bmi > 18.5 && bmi <=24.9)
                {
                    evaluation.text = "NORMAL"
                    imgeval.setImageResource(R.drawable.normal)
                }

                else if(bmi > 24.9 && bmi <= 30)
                {
                    evaluation.text = "OVERWEIGHT"
                    imgeval.setImageResource(R.drawable.over)

                }

                else if(bmi > 30)
                {
                    evaluation.text = "OBESE"
                    imgeval.setImageResource(R.drawable.obese)
                }
            }

            else
            {
                Toast.makeText(applicationContext, "Please input weight and height", Toast.LENGTH_SHORT).show()
                factor.text = " - "
                evaluation.text = " - "
                imgeval.setImageResource(R.drawable.transparent)
            }
        })
    }
}