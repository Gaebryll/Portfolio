package com.example.giftideas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Gifts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gifts)

        val bundle: Bundle? = intent.extras
        val gen = bundle!!.getInt("genValue")
        val age = bundle.getInt("ageValue")
        val singleImg: ImageView = findViewById(R.id.single)
        val mulImg = findViewById<ImageView>(R.id.first)
        val mulImg2 = findViewById<ImageView>(R.id.sec)

        
        when(gen){
            1 -> {
                when((age + gen)){
                    2 -> {
                        mulImg.setImageResource(R.drawable.blanketb)
                        mulImg2.setImageResource(R.drawable.trucks)
                    }
                    3 -> {
                        singleImg.setImageResource(R.drawable.jerseyb)
                    }
                    4 -> {
                        mulImg.setImageResource(R.drawable.tie)
                        mulImg2.setImageResource(R.drawable.watchb)
                    }
                }
            }
            2 -> {
                when((age + gen)){

                    3 -> {
                        mulImg.setImageResource(R.drawable.blanketg)
                        mulImg2.setImageResource(R.drawable.doll)
                    }
                    4 -> {
                        singleImg.setImageResource(R.drawable.jerseyg)
                    }
                    5 -> {
                        mulImg.setImageResource(R.drawable.earrings)
                        mulImg2.setImageResource(R.drawable.watchg)
                    }
                }
                }
            }
    }

    override fun onBackPressed() {
        val intentMain = Intent(this, MainActivity::class.java)
        startActivity(intentMain)
        super.onBackPressed()
    }
}
