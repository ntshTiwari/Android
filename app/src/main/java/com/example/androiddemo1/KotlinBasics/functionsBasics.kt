package com.example.androiddemo1.KotlinBasics

fun main() {
    val sumOfTwoNumbers = addTwoIntegers(2,1);
    println(sumOfTwoNumbers);
}

/// take two integers and returns an integer
fun addTwoIntegers(a: Int, b: Int): Int {
    return a+b;
}