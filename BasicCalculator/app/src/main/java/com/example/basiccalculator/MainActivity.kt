package com.example.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.basiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val res:TextView = findViewById(R.id.res)

        binding.addButton.setOnClickListener(View.OnClickListener {
            if(!binding.num1.text.isEmpty() && !binding.num2.text.isEmpty())
            {
                var sum = binding.num1.text.toString().toInt() + binding.num2.text.toString().toInt()
                res.text = "The SUM is "+ sum

            }
            else
            {
                Toast.makeText(applicationContext, "Please input 2 numbers", Toast.LENGTH_SHORT).show();
            }
        })

        binding.subButton.setOnClickListener(View.OnClickListener {
            if(!binding.num1.text.isEmpty() && !binding.num2.text.isEmpty())
            {
                var diff = binding.num1.text.toString().toInt() - binding.num2.text.toString().toInt()
                res.text = "The DIFFERENCE is "+ diff
            }
            else
            {
                Toast.makeText(applicationContext, "Please input 2 numbers", Toast.LENGTH_SHORT).show();
            }
        })

        binding.mulButton.setOnClickListener(View.OnClickListener {
            if(!binding.num1.text.isEmpty() && !binding.num2.text.isEmpty())
            {
                var prod = binding.num1.text.toString().toInt() * binding.num2.text.toString().toInt()
                res.text = "The PRODUCT is "+ prod
            }
            else
            {
                Toast.makeText(applicationContext, "Please input 2 numbers", Toast.LENGTH_SHORT).show();
            }
        })

        binding.divButton.setOnClickListener(View.OnClickListener {
            if(!binding.num1.text.isEmpty() && !binding.num2.text.isEmpty())
            {
                var quo = binding.num1.text.toString().toInt() / binding.num2.text.toString().toInt()
                res.text = "The QUOTIENT is "+ quo
            }
            else
            {
                Toast.makeText(applicationContext, "Please input 2 numbers", Toast.LENGTH_SHORT).show();
            }
        })

    }
}