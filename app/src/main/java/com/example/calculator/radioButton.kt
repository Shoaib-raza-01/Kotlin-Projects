package com.example.calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class radioButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)
        val Rgrp = findViewById<RadioGroup>(R.id.RGrp)
        val BtnSubmit = findViewById<Button>(R.id.button6)
        val BtnReset = findViewById<Button>(R.id.button7)
        val txtView = findViewById<TextView>(R.id.textView3)

        BtnSubmit.setOnClickListener {
            val selectId:Int = Rgrp.checkedRadioButtonId
            var radioButton = findViewById<Button>(selectId)
            var out:String = radioButton.text.toString()
            txtView.text = "Selected: $out "


        }
        BtnReset.setOnClickListener {
            Toast.makeText(applicationContext,"hello",Toast.LENGTH_SHORT).show()
            Rgrp.setOnCheckedChangeListener(null);
            Rgrp.clearCheck();
            txtView.text = ""
            Rgrp.setOnCheckedChangeListener(
                RadioGroup.OnCheckedChangeListener { group, checkedId ->
                    val radio: RadioButton = findViewById(checkedId)
                    Toast.makeText(
                        applicationContext, " On checked change : ${radio.text}",
                        Toast.LENGTH_SHORT
                    ).show()
// radio.setTextColor(Color.parseColor("#fe9c02"))
                }
            )


        }

        Rgrp.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(
                    applicationContext, " On checked change : ${radio.text}",
                    Toast.LENGTH_SHORT
                ).show()
// radio.setTextColor(Color.parseColor("#fe9c02"))
            }
        )
    }
}