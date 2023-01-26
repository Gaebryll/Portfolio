package com.example.pokemonpoll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val charCnt = findViewById<TextView>(R.id.charCnt)
        val sqrCnt = findViewById<TextView>(R.id.sqrCnt)
        val bulCnt = findViewById<TextView>(R.id.bulCnt)

        val charBtn = findViewById<Button>(R.id.charBtn)
        val sqrBtn = findViewById<Button>(R.id.sqrBtn)
        val bulBtn = findViewById<Button>(R.id.bulBtn)

        val resetBtn = findViewById<Switch>(R.id.resetBtn)
        val image = findViewById<ImageView>(R.id.transparent)

        var cntCharmander: Int = 0
        var cntSquirtle: Int = 0
        var cntBulbasaur: Int = 0

        charBtn.setOnClickListener {
            cntCharmander++
            charCnt.text = "%d".format(cntCharmander)
            image.setImageResource(R.drawable.charmander)
        }

        sqrBtn.setOnClickListener {
            cntSquirtle++;
            sqrCnt.text = "%d".format(cntSquirtle)
            image.setImageResource(R.drawable.squirtle)
        }

        bulBtn.setOnClickListener {
            cntBulbasaur++;
            bulCnt.text = "%d".format(cntBulbasaur)
            image.setImageResource(R.drawable.bulbasaur)
        }

        resetBtn.setOnCheckedChangeListener { _, isChecked ->

            if (!isChecked){
                cntCharmander = 0
                cntSquirtle = 0
                cntBulbasaur = 0

                charCnt.text = "0"
                sqrCnt.text = "0"
                bulCnt.text = "0"

                image.setImageResource(R.drawable.transparent)

                Toast.makeText(applicationContext, "Poll is reset", Toast.LENGTH_SHORT).show();
            }
        }
    }
}