package com.example.androiddemo1.KotlinBasics

fun main(){
    //// For loop

    // for i from 1 to 10
    for(i in 1..10){
        print(i);
    }

    println();

    // for i from 1 to 10 => 10 not included
    for(i in 1 until 10){
        print(i);
    }

    println();

    // same as above
    for(i in 1.until(10)){
        print(i);
    }

    println();

    // for i from 10 to 1 => 10 and 1 both included
    for(i in 10 downTo 1){
        print(i);
    }

    println();

    // for i from 10 to 1 with 2 steps => 10 and 1 both included
    for(i in 10 downTo 1 step 2){
        print(i);
    }

    println();

    /// same as above
    for(i in 10.downTo(1).step(2)){
        print(i);
    }
}