package com.example.lockupbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.lockupbuttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btn = arrayOf<ImageButton>(binding.btn1, binding.btn2, binding.btn3, binding.btn4, binding.btn5, binding.btn6,
            binding.btn7, binding.btn8, binding.btn9, binding.btn10)

        for(button in btn){

            button.alpha = 0.2F
            button.isEnabled = false

        }

        binding.switchBtn.setOnClickListener() {

            if(!binding.switchBtn.isChecked){
                for(button in btn){

                    button.alpha = 0.2F
                    button.isEnabled = false

                }

            }

            else{

                for(button in btn){

                    button.alpha = 1F
                    button.isEnabled = true

                }

            }

        }

        for(button in btn){
            button.setOnClickListener(){
                val value = btn.indexOf(button) + 1
                Toast.makeText(this@MainActivity, "Button $value was pressed", Toast.LENGTH_SHORT).show()
            }
        }


    }
}