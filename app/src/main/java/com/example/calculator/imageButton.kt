package com.example.calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import com.example.calculator.R.*
import com.google.android.material.snackbar.Snackbar

class imageButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_image_button)
        title = "Image Button"
        val imgBtn1 = findViewById<ImageButton>(id.imageButton3)
        val imgBtn2 = findViewById<ImageButton>(id.imageButton4)
        val txt = findViewById<TextView>(R.id.textView9)

        imgBtn1.setOnClickListener(){
            txt.text = "Selected Sea"
            Snackbar.make(it,"You clicked on Sea",Snackbar.LENGTH_LONG).setAction("DISMISS", View.OnClickListener {
                txt.text = "Snack Bar was Canceled"
            }).show()
        }

        imgBtn2.setOnClickListener{
            txt.text = "Selected Mountains"
            Snackbar.make(it,"You clicked on Mountains",Snackbar.LENGTH_LONG)
                .setActionTextColor(Color.BLACK).setBackgroundTint(Color.CYAN).setAction("Cancel",View.OnClickListener {
                    txt.text = "Snack Bar was Canceled"
                }).show()
        }
    }
}