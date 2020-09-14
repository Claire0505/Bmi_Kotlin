package com.claire.javalib

fun main(){
    val p = Person()
    p.weight = 60f
    p.height = 1.6f
    println("Your BMI is ${p.getBmi()}")

}

class Person {
    var weight: Float = 0f
    var height: Float = 0f

    fun sayHello(){
        println("Hello")
    }

    fun getBmi() : Float {
        val bmi = weight / (height * height)
        return bmi
    }
}