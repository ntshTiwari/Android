package com.example.androiddemo1

fun main() {
    var nullableName: String? = "Name";
//    nullableName = null;

    /// ?. can be used to operate if the value is not null, else it will give null
    var nullableNameLength = nullableName?.length;

    /// !! can be used if we know the nullable variable is not null now
    var notNullableNameLength = nullableName!!.length;


    nullableName?.let {
        /// this block will only get executed when nullableName is not null
        /// it gives us an access to the variable itself, here nullableName
        println(it?.length);
    }


    /// ?: => Elvis operator => assign a default value if the value is null
    nullableName = null;
    val notNullName = nullableName ?: "NotNullableName";
    println(notNullName);
}