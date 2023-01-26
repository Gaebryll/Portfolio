package com.example.guessthenumber

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.guessthenumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btn = arrayOf<ImageButton>(binding.btn1, binding.btn2, binding.btn3, binding.btn4, binding.btn5, binding.btn6,
            binding.btn7, binding.btn8, binding.btn9, binding.btn10)

        var attempts : Int = 3
        var buttonNumber : Int = 0
        var valRandom : Int = 0

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
                attempts = 3
                buttonNumber = 0
            }
            else{
                for(button in btn){
                    button.alpha = 1F
                    button.isEnabled = true
                }
                valRandom = (1..10).random()
                buttonNumber = valRandom
                Toast.makeText(this@MainActivity, "$valRandom", Toast.LENGTH_SHORT).show()
            }
        }

        for(button in btn){
            button.setOnClickListener(){
                val value = btn.indexOf(button) + 1
                Toast.makeText(this@MainActivity, "Button $value was pressed", Toast.LENGTH_SHORT).show()

                if (value == buttonNumber){
                    AlertDialog.Builder(this)
                        .setMessage("Number Found! You Win!")
                        .show()
                    val winPlay = MediaPlayer.create(this, R.raw.success)
                    winPlay.start()
                    for(button in btn){
                        button.alpha = 0.2F
                        button.isEnabled = false
                        binding.switchBtn.isChecked = false
                    }
                    attempts = 3
                }
                else if(attempts == 0){
                    AlertDialog.Builder(this)
                        .setMessage("No More Attempts! Nice try...")
                        .show()
                    val losePlay = MediaPlayer.create(this, R.raw.fail)
                    losePlay.start()
                    for(button in btn){
                        button.alpha = 0.2F
                        button.isEnabled = false
                        binding.switchBtn.isChecked = false
                    }
                    attempts = 3
                }
                else if(attempts < 3 && attempts !=0){
                    if (value < buttonNumber){
                        AlertDialog.Builder(this)
                            .setMessage("HIGHER. Attempts Left: $attempts")
                            .show()
                        val tryPlay = MediaPlayer.create(this, R.raw.tries)
                        tryPlay.start()
                    }
                    else{
                        AlertDialog.Builder(this)
                            .setMessage("LOWER. Attempts Left: $attempts")
                            .show()
                        val tryPlay = MediaPlayer.create(this, R.raw.tries)
                        tryPlay.start()
                    }
                }
                attempts -= 1
            }
        }

    }

}