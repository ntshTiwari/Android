package com.example.androiddemo1.KotlinBasics

fun main() {
    /// val => immutable variable
    val fixedVariable = "This is a fixed/final variable";

    /// var => mutable variable
    var unfixedVariable = "This is not a fixed/final variable";
    unfixedVariable = "changed the value of the variable";

    /// we can define types using : DataType
    val definedTypes: Int = 2
    println(definedTypes.toString());

    val definedTypesNew: Int
    definedTypesNew = 21;

    println(definedTypesNew.toString());

    /// this will throw an error as Kotlin tries to assign 13.37 as double,
//    var myFloat: Float = 13.37
    /// if we want to make it float we need to append it with F => 13.37F
    var myFloat: Float = 13.37F
    println(myFloat.toString());

    /// Boolean
    var myBoolean: Boolean = true
    println(myBoolean.toString());

    /// Char
    var myChar: Char = 'C'
    println(myChar.toString());

    /// if a variable is surrounded by single quotes then it is a char
    var myChar2 = 'C'
    println(myChar2.toString());

    /// String
    var myString: String = "String"
    println(myString.toString());

    /// if a variable is surrounded by double quotes then it is a char
    var myString2 = "String"
    println(myString2.toString());

    /// we can access characters of a string like an array
    println(myString2[0]);

    /// String Interpolation in Kotlin
    println("${myString2[0]} is the first letter and ${myString2.subSequence(1, myString2.length)} are the rest of the letters")

    /// Arithmetic Operators => +, -, /, *, %

    /// Comparison Operators => ==, !=, <, >, >=

    /// Assignment Operators => +=, -=, /=, *=, %=

}