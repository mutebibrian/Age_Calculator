package com.kotlinseries.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun BuClickEvent(view: View) {
        val DOB = findViewById<EditText>(R.id.etdob)
        val SHOWAGE =findViewById<TextView>(R.id.tvshow)
        val userDOB:String = DOB.text.toString()
        if (userDOB.toInt() == 0){
            SHOWAGE.text ="inavalid input"
            return
        }
        if (userDOB.toInt()>=2023){
            SHOWAGE.text="Please correcy Dob"
            return
        }
        val year:Int = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = year - userDOB.toInt()
        SHOWAGE.text = "Your Age is $myAge"


    }
}