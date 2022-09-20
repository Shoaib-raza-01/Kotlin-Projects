package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.StringBuilder
import android.widget.TextView
import android.widget.Toast
import kotlin.properties.Delegates

class calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        var txt = findViewById<TextView>(R.id.textView4)
        var clr = findViewById<Button>(R.id.clrBtn)
        val prcnt = findViewById<Button>(R.id.prcntBtn)
        var back = findViewById<Button>(R.id.backBtn)
        var divd =findViewById<Button>(R.id.divdBtn)
        var seven = findViewById<Button>(R.id.sevenBtn)
        var eight = findViewById<Button>(R.id.eightBtn)
        var nine = findViewById<Button>(R.id.nineBtn)
        var into = findViewById<Button>(R.id.intoBtn)
        var four = findViewById<Button>(R.id.fourBtn)
        var five = findViewById<Button>(R.id.fiveBtn)
        var six = findViewById<Button>(R.id.sixBtn)
        var minus = findViewById<Button>(R.id.minusBtn)
        var one = findViewById<Button>(R.id.oneBtn)
        var two =findViewById<Button>(R.id.twoBtn)
        var three = findViewById<Button>(R.id.threeBtn)
        var plus = findViewById<Button>(R.id.plusBtn)
        var power = findViewById<Button>(R.id.powerBtn)
        var zero = findViewById<Button>(R.id.zeroBtn)
        var dot = findViewById<Button>(R.id.dotBtn)
        var equal = findViewById<Button>(R.id.equalBtn)

        var oprnt1 = ""
        var oprnt2 = ""
        var operator by Delegates.notNull<Char>()

//        var oprnt1 by Delegates.notNull<Int>()
//        var oprnt2 by Delegates.notNull<Int>()



        clr.setOnClickListener{
            txt.text = ""
            oprnt1 = ""
            oprnt2 = ""
            Toast.makeText(applicationContext,"TextView was cleared",Toast.LENGTH_LONG).show()
        }

        one.setOnClickListener{

            if (txt.text.isEmpty()){
//                oprnt1 = StringBuilder().append("1").toString()
                oprnt1 += "1"
                txt.text = "${txt.text}$oprnt1"
            }else{
//                oprnt2 = StringBuilder().append("1").toString()
                oprnt2 += "1"
                txt.text = "${txt.text}$oprnt2"
            }
        }

        two.setOnClickListener{
            if (txt.text.isEmpty()){
//                oprnt1 = StringBuilder().append("2").toString()
                oprnt1 += "2"
                txt.text = "${txt.text}$oprnt1"
            }else{
//                oprnt2 = StringBuilder().append("2").toString()
                oprnt2 += "2"
                txt.text = "${txt.text}$oprnt2"
            }
        }

        three.setOnClickListener{
            if (txt.text.isEmpty()){
//                oprnt1 = StringBuilder().append("3").toString()
                oprnt1 += "3"
                txt.text = "${txt.text}$oprnt1"
            }else{
//                oprnt2 = StringBuilder().append("3").toString()
                oprnt2 += "3"
                txt.text = "${txt.text}$oprnt2"
            }
        }

        four.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = StringBuilder().append("4").toString()
                txt.text = "${txt.text}$oprnt1"
            }else{
                oprnt2 = StringBuilder().append("4").toString()
                txt.text = "${txt.text}$oprnt2"
            }
        }

        five.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = StringBuilder().append("5").toString()
                txt.text = "${txt.text}$oprnt1"
            }else{
                oprnt2 = StringBuilder().append("5").toString()
                txt.text = "${txt.text}$oprnt2"
            }
        }

        six.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = StringBuilder().append("6").toString()
                txt.text = "${txt.text}$oprnt1"
            }else{
                oprnt2 = StringBuilder().append("6").toString()
                txt.text = "${txt.text}$oprnt2"
            }
        }

        seven.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = StringBuilder().append("7").toString()
                txt.text = "${txt.text}$oprnt1"
            }else{
                oprnt2 = StringBuilder().append("7").toString()
                txt.text = "${txt.text}$oprnt2"
            }
        }

        eight.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = StringBuilder().append("8").toString()
                txt.text = "${txt.text}$oprnt1"
            }else{
                oprnt2 = StringBuilder().append("8").toString()
                txt.text = "${txt.text}$oprnt2"
            }
        }

        nine.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = StringBuilder().append("9").toString()
                txt.text = "${txt.text}$oprnt1"
            }else{
                oprnt2 = StringBuilder().append("9").toString()
                txt.text = "${txt.text}$oprnt2"
            }
        }

        zero.setOnClickListener{
            if (txt.text.isEmpty()){
                oprnt1 = StringBuilder().append("0").toString()
                txt.text = "${txt.text}$oprnt1"
            }else{
                oprnt2 = StringBuilder().append("0").toString()
                txt.text = "${txt.text}$oprnt2"
            }
        }

        plus.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                operator = '+'
                txt.text = "${txt.text} + "
            }
        }

        into.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                operator = '*'
                txt.text = "${txt.text} * "
            }
        }

        minus.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                operator = '-'
                txt.text = "${txt.text} - "
            }
        }

        divd.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                operator = '/'
                txt.text = "${txt.text} / "
            }
        }

        prcnt.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                operator = '%'
                txt.text = "${txt.text} % "
            }
        }

        power.setOnClickListener{
            if(txt.text.isEmpty()){
            }else{
                operator = '^'
                txt.text = "${txt.text} ^ "
            }
        }

        equal.setOnClickListener{
            when(operator){
                '%' -> {
                    var res = (oprnt1.toInt() * oprnt2.toInt()) / 100
                    txt.text = res.toLong().toString()
                    oprnt1 = res.toString()
                }
                '+' -> {
                    var res = oprnt1.toInt() + oprnt2.toInt()
                    txt.text = res.toString()
                    oprnt1 = res.toString()
                }
                '-' -> {
                    var res = oprnt1.toInt() - oprnt2.toInt()
                    txt.text = res.toString()
                    oprnt1 = res.toString()
                }
                '*' -> {
                    var res = oprnt1.toInt() * oprnt2.toInt()
                    txt.text = res.toString()
                    oprnt1 = res.toString()
                }
                '/' -> {
                    var res = oprnt1.toInt() / oprnt2.toInt()
                    txt.text = res.toString()
                    oprnt1 = res.toString()
                }
                '^' -> {
                    var res:Long = 1
                    var pow = oprnt2.toInt()
                    while (pow != 0) {
                        res *= oprnt1.toLong()
                        --pow
                    }
                    txt.text = res.toString()
                    oprnt1 = res.toString()
                }
            }
            oprnt1 = ""
            oprnt2 = ""
        }
    }
}