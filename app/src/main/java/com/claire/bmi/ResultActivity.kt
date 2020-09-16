package com.claire.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //使用 Bundle 類別一次接收多筆資料
        val getBundle = intent.extras
        val bmi = getBundle?.getFloat("BMI_EXTRA", 0f)
        val testing = getBundle?.getString("TEST_EXTRA")
        text_result.text = bmi.toString()
        Toast.makeText(this, testing, Toast.LENGTH_SHORT).show()

        /*val bmi : Float = intent.getFloatExtra("BMI_EXTRA", 0f)
        text_result.text = bmi.toString()*/
    }
}