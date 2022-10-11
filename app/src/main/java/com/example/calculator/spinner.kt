package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class spinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        val spin = findViewById<Spinner>(R.id.spinner)
        val btn = findViewById<Button>(R.id.button22)
        val lang = arrayOf("Kotlin", "Swift", "Flutter", "Java", "React Native", "JavaScript")
        if (spin != null){
            val adapter = ArrayAdapter(applicationContext,android.R.layout.simple_spinner_item,lang)
            spin.adapter = adapter

            spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View,
                    position: Int,
                    id: Long
                ) {
                  Toast.makeText(this@spinner,"Selected Language"+ " " +
                          "" + lang[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>){}
                }
            btn.setOnClickListener{
                intent = Intent(applicationContext,calculator::class.java)
                startActivity(intent)
            }
        }
    }
}