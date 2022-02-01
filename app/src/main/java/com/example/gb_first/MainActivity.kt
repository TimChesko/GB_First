package com.example.gb_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.gb_first.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Human("Тима", 18)
        val name: TextView = findViewById(R.id.name) as TextView
        val age: TextView = findViewById(R.id.age) as TextView
        val objectView = object {
            val Hume1 = student.copy()
        }
        age.text = objectView.Hume1.toString()

    }

    data class Human (var name:String, val age:Int)
}
