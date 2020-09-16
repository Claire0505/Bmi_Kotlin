package com.claire.bmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_help.setOnClickListener{
            AlertDialog.Builder(this)
                .setTitle("BMI說明")
                .setMessage("體重(kg) / 身高的平方(m)")
                .setPositiveButton("Ok", null)
                .show()

        }

    }

    fun calculateBmi( view : View){

        if (ed_Weight.text.trim().isEmpty() || ed_Height.text.trim().isEmpty()){

            Toast.makeText(this, "Please input your Weight and Height", Toast.LENGTH_SHORT).show()

        } else {

            val weight = ed_Weight.text.toString().toFloat()
            val height = ed_Height.text.toString().toFloat()
            val bmi = weight / (height * height)

            Log.d("bmi", bmi.toString())

            //使用 Bundle 類別一次傳送多筆資料
            val bundle = Bundle()
            Intent(this, ResultActivity:: class.java).apply {
                bundle.putFloat("BMI_EXTRA", bmi)
                bundle.putString("TEST_EXTRA", "Testing")
                putExtras(bundle)

                startActivity(this)
            }

           /* Intent(this, ResultActivity:: class.java).apply {
                putExtra("BMI_EXTRA", bmi)
                startActivity(this) }*/

          /*  Toast.makeText(this, bmi.toString(),Toast.LENGTH_SHORT).show()
            AlertDialog.Builder(this)
                .setTitle("Your BMI")
                .setMessage(bmi.toString())
                .setPositiveButton("Ok", null)
                .setNegativeButton("Cancel",  null)
                .show()*/
        }

    }
}