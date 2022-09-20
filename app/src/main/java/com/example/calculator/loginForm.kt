package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class loginForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)
//        title = "Login Form"
        var fName = findViewById<EditText>(R.id.editTextTextPersonName)
        var lName = findViewById<EditText>(R.id.editTextTextPersonName2)
        var pass = findViewById<EditText>(R.id.editTextTextPassword)
        var mail = findViewById<EditText>(R.id.editTextTextEmailAddress)
        var pNum = findViewById<EditText>(R.id.editTextNumber)
        var age = findViewById<EditText>(R.id.editTextNumber2)

        var btn = findViewById<Button>(R.id.button2)

        btn.setOnClickListener(){
            if (fName.text.isEmpty()||lName.text.isEmpty()||pass.text.isEmpty()||mail.text.isEmpty()||pNum.text.isEmpty()||age.text.isEmpty()){
                Toast.makeText(this,"Please fill the data properly",Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this,"Your data have been saved",Toast.LENGTH_LONG).show()
            }
        }
    }
}