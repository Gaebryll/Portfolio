package com.example.quoteoftheday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtdisplay: TextView = findViewById(R.id.txtdisplay)
        val newquote: ImageButton = findViewById(R.id.newquote)

        val quoteArr = arrayOf(
            "You only live once, but if you do it right, once is enough. - Mae West" ,
            "If you want to live a happy life, tie it to a goal, not to people or things.– Albert Einstein",
            "If life were predictable it would cease to be life, and be without flavor. – Eleanor Roosevelt",
            "Tell me and I forget. Teach me and I remember. Involve me and I learn. -Benjamin Franklin",
            "Don’t settle for what life gives you; make life better and build something. — Ashton Kutcher",
            "Do not go where the path may lead, go instead where there is no path and leave a trail. -Ralph Waldo Emerson",
            "You will face many defeats in life, but never let yourself be defeated. -Maya Angelou",
            "Never let the fear of striking out keep you from playing the game. -Babe Ruth",
            "The only impossible journey is the one you never begin. -Tony Robbins",
            "The greatest mistake you can make is to be continually fearing that you’ll make one. -Elbert Hubbard")

        var currentQuote : Int = 0;

        newquote.setOnClickListener {
            var rand: Int

            do {
                rand = Random.nextInt(0, 9)
            } while (currentQuote == rand)

            txtdisplay.text = quoteArr[rand]
            rand.also { currentQuote = it }
        }
    }
}

