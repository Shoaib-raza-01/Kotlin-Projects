package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1= findViewById<TextView>(R.id.editText)
        var num2 = findViewById<TextView>(R.id.editTextNumber)
        var btn = findViewById<Button>(R.id.button)
        var btn2 = findViewById<Button>(R.id.button3)
        var btn3 =  findViewById<Button>(R.id.button4)
        var btn4 = findViewById<Button>(R.id.button5)

        btn.setOnClickListener() {
            if (num1.text.toString().isEmpty() || num2.text.toString().isEmpty()) {
                Toast.makeText(this,"Please enter values",Toast.LENGTH_LONG).show()
            } else {
                var a:Int = num1.text.toString().toInt()
                var b:Int = num2.text.toString().toInt()
                var sum:Int = a + b
                Toast.makeText(this,"Sum of two numbers = ${sum.toString()}",Toast.LENGTH_LONG).show()
            }
        }
        btn2.setOnClickListener(){
            if (num1.text.isEmpty() || num2.text.isEmpty()) {
                Toast.makeText(this,"Please enter values",Toast.LENGTH_LONG).show()
            } else {
                var a:Int = num1.text.toString().toInt()
                var b:Int = num2.text.toString().toInt()
                var sum:Int = a - b
                Toast.makeText(this,"Difference of two numbers = ${sum.toString()}",Toast.LENGTH_LONG).show()
            }
        }
        btn3.setOnClickListener(){
            if (num1.text.toString().isEmpty() || num2.text.toString().isEmpty()) {
                Toast.makeText(this,"Please enter values ${num1.toString()}",Toast.LENGTH_LONG).show()
            } else {
                var a:Int = num1.text.toString().toInt()
                var b:Int = num2.text.toString().toInt()
                var sum:Int = a * b
                Toast.makeText(this,"Multiplication of two numbers = ${sum.toString()}",Toast.LENGTH_LONG).show()
            }
        }
        btn4.setOnClickListener(){
            if (num1.text.isEmpty() || num2.text.isEmpty()) {
                Toast.makeText(this,"Please enter values",Toast.LENGTH_LONG).show()
            } else {
                var a:Int = num1.text.toString().toInt()
                var b:Int = num2.text.toString().toInt()
                var sum:Int = a / b
                Toast.makeText(this,"On dividing two numbers = ${sum.toString()}",Toast.LENGTH_LONG).show()
            }
        }
    }
}