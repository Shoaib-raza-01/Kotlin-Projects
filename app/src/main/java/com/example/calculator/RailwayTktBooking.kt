package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class RailwayTktBooking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_railway_tkt_booking)
        title = "Plan your Journey"
        var start = findViewById<EditText>(R.id.editTextTextPersonName10)
        var end = findViewById<EditText>(R.id.editTextTextPersonName11)
        var date = findViewById<EditText>(R.id.editTextTextPersonName12)
        var search = findViewById<Button>(R.id.button30)
        search.setOnClickListener{
            if (start.text.isEmpty() || end.text.isEmpty() || date.text.isEmpty()){
                Snackbar.make(it,"Please enter Details properly",Snackbar.LENGTH_LONG).show()
            }
            else{
                intent = Intent(this,TrainName::class.java)
//                intent.putExtra("start", start)
            }
        }
    }
}