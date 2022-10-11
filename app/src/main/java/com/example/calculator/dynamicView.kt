package com.example.calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.graphics.toColorInt
import androidx.core.view.marginStart

class dynamicView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_view)
        val txt = findViewById<EditText>(R.id.editTextTextPersonName5)
        val btn = findViewById<Button>(R.id.button14)
        val ll = findViewById<LinearLayout>(R.id.linear)
        btn.setOnClickListener{
            val t = TextView(this)
            var b = txt.text.toString()
            t.text= b
            t.setTextColor(Color.parseColor("#FFFFFF"))
            t.textSize = 20F
            t.gravity = Gravity.CENTER
            txt.setText("")
//            t.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,)
            ll.addView(t)
        }
    }
}