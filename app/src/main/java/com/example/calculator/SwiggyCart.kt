package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class SwiggyCart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swiggy_cart)
        title = "Details"
        var btn = findViewById<Button>(R.id.button24)
        var txt = findViewById<TextView>(R.id.textView49)
        txt.text ="  Net Payable :     " + intent.getStringExtra("total")
        btn.setOnClickListener{
            Snackbar.make(it, "Your food will be delivered soon",Snackbar.LENGTH_LONG).show()
        }
    }
}