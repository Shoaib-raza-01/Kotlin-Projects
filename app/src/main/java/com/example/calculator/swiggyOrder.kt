package com.example.calculator

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class swiggyOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swiggy_order)
        title = "Swiggy"
        var sum = 0.0
        val choleBtn = findViewById<Button>(R.id.button9)
        val comboBtn = findViewById<Button>(R.id.button11)
        val momoBtn = findViewById<Button>(R.id.button12)
        val barBtn = findViewById<Button>(R.id.button13)
        val brgrBtn = findViewById<Button>(R.id.button15)
        val dntBtn = findViewById<Button>(R.id.button16)
        val dosaBtn = findViewById<Button>(R.id.button10)
        val desrtBtn = findViewById<Button>(R.id.button17)
        val friesBtn = findViewById<Button>(R.id.button18)
        val idliBtn = findViewById<Button>(R.id.button19)
        val nodlsBtn = findViewById<Button>(R.id.button20)
        val pizzaBtn = findViewById<Button>(R.id.button21)
        val cartBtn = findViewById<Button>(R.id.button23)

        choleBtn.setOnClickListener{
            sum += 1.75
            Snackbar.make(it,"Chole is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    startActivity(Intent(this,SwiggyCart::class.java))
                }.show()
        }

        comboBtn.setOnClickListener{
            sum += 1.99
            Snackbar.make(it,"Combo is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    intent  = Intent(this,SwiggyCart::class.java);
                    intent.putExtra("total",sum.toString())
//                    startActivity(Intent(this,SwiggyCart::class.java))
                    startActivity(intent)
                }.show()
        }

        momoBtn.setOnClickListener{
            sum += 0.79
            Snackbar.make(it,"Momo is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    startActivity(Intent(this,SwiggyCart::class.java))
                }.show()
        }

        barBtn.setOnClickListener{
            sum += 2.09
            Snackbar.make(it,"Barbeque is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    startActivity(Intent(this,SwiggyCart::class.java))
                }.show()
        }

        brgrBtn.setOnClickListener{
            sum += 0.89
            Snackbar.make(it,"Burger is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    startActivity(Intent(this,SwiggyCart::class.java))
                }.show()
        }

        dntBtn.setOnClickListener{
            sum += 0.89
            Snackbar.make(it,"Donut is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    startActivity(Intent(this,SwiggyCart::class.java))
                }.show()
        }
        dosaBtn.setOnClickListener{
            sum += 3.49
            Snackbar.make(it,"Dosa is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    startActivity(Intent(this,SwiggyCart::class.java))
                }.show()
        }

        desrtBtn.setOnClickListener{
            sum += 1.69
            Snackbar.make(it,"Dessert is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    startActivity(Intent(this,SwiggyCart::class.java))
                }.show()
        }

        friesBtn.setOnClickListener{
            sum += 1.02
            Snackbar.make(it,"Fries is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    startActivity(Intent(this,SwiggyCart::class.java))
                }.show()
        }

        idliBtn.setOnClickListener{
            sum += 1.5
            Snackbar.make(it,"Idli is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    Toast.makeText(this, "Net Payable : $sum", Toast.LENGTH_LONG).show()
                }.show()
        }

        nodlsBtn.setOnClickListener{
            sum += 0.55
            Snackbar.make(it,"Noodles is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    startActivity(Intent(this,SwiggyCart::class.java))
                }.show()
        }

        pizzaBtn.setOnClickListener{
            sum += 3.49
            Snackbar.make(it,"Pizza is added to cart",Snackbar.LENGTH_LONG)
                .setAction("ORDER") {
                    startActivity(Intent(this,SwiggyCart::class.java))
                }.show()
        }

        cartBtn.setOnClickListener{
            intent = Intent(this,SwiggyCart::class.java)
            startActivity(intent)
        }
    }
}