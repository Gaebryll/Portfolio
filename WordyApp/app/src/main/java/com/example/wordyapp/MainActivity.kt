package com.example.wordyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import com.example.wordyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val list = mutableListOf<String>()
    private var isAscending : Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputWord = findViewById<EditText>(R.id.inputWord)
        val addBtn = findViewById<Button>(R.id.addBtn)
        val clearBtn = findViewById<Button>(R.id.clearBtn)
        val radioAsc = findViewById<RadioButton>(R.id.radioAsc)
        val radioDes = findViewById<RadioButton>(R.id.radioDes)
        val wordDisplay = findViewById<TextView>(R.id.wordDisplay)

        addBtn.setOnClickListener {

            if(inputWord.text.isNotBlank())
            {
                list.add(inputWord.text.toString())
            }

            viewUpdate(wordDisplay)
            inputWord.text.clear()

        }

        clearBtn.setOnClickListener{
            list.clear()
            wordDisplay.text = ""
        }

        radioAsc.setOnCheckedChangeListener{ _, isChecked ->
            isAscending = isChecked

            viewUpdate(wordDisplay)
        }

        radioDes.setOnCheckedChangeListener { _, isChecked ->
            isAscending = !isChecked

            viewUpdate(wordDisplay)
        }
    }

    private fun viewUpdate(view: TextView){

        view.text = ""

        list.sort()

        if (!isAscending){
            list.reverse()
        }

        for(i in list){
            view.text = "${view.text}\n${i}"
        }

    }
}