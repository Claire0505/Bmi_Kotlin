package com.claire.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun calculateBmi( view : View){
        val weight = ed_Weight.text.toString().toFloat()
        val height = ed_Height.text.toString().toFloat()
        val bmi = weight / (height * height)
        Log.d("bmi", bmi.toString())

    }
}