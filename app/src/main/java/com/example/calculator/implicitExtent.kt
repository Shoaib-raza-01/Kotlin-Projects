package com.example.calculator

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button

class implicitExtent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_extent)
        val btn1 = findViewById<Button>(R.id.button25)
        val btn2 = findViewById<Button>(R.id.button26)
        val btn3 = findViewById<Button>(R.id.button27)
        val btn4 = findViewById<Button>(R.id.button28)
        val btn5 = findViewById<Button>(R.id.button29)

        btn1.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cameraIntent)
        }

        btn2.setOnClickListener {
            val intentCallLog = Intent(Intent.ACTION_VIEW)
            intentCallLog.type = CallLog.Calls.CONTENT_TYPE
            startActivity(intentCallLog)
        }
        btn3.setOnClickListener {
            val contIntent = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(contIntent)
        }
        btn4.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.type = "image/*"
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel: +919876456543")
            startActivity(intent)
        }
    }
}