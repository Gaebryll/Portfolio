package com.example.listapp

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter2(private val context : Activity, private val title: Array<String>, private val subtitle: Array<String>, private val img: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.activity_listview, title){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_listview, null, true)

        val titleText = rowView.findViewById<TextView>(R.id.titleText)
        val subtitleText = rowView.findViewById<TextView>(R.id.subtitleText)
        val imageView = rowView.findViewById<ImageView>(R.id.imageView)

        titleText.text = title[position]
        subtitleText.text = subtitle[position]
        imageView.setImageResource(img[position])

        return rowView
    }

}