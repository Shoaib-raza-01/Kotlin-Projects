package com.example.calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView

class adaptorConcept : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adaptor_concept)
        var ll = findViewById<LinearLayout>(R.id.linearLayout)
        var lv = findViewById<ListView>(R.id.listView)
        var a = arrayOf(Color.MAGENTA,Color.BLUE,Color.GRAY,Color.GREEN, Color.CYAN, Color.LTGRAY, Color.DKGRAY, Color.TRANSPARENT)
        var b = arrayOf("Magenta", "Blue", "Gray", "Green", "Cyan", "LtGray", "Dark Gray", "Transparent")
        val ab = ArrayAdapter(this, android.R.layout.simple_list_item_1, b)
        lv.adapter = ab
        lv.setOnItemClickListener {
                AdapterView, View, position, id ->
            ll.setBackgroundColor(a[position])
        }
    }
}