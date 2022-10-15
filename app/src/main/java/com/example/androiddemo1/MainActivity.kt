package com.example.androiddemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/// Activity = Screen
/// MainActivity : AppCompatActivity() means MainActivity inherits from AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /// setContentView => set an xml as the content of this screen
        /// R.layout.activity_main => go to `activity_main.xml` in `layout` inside `res` folder
        setContentView(R.layout.activity_main)

        /// `Toast` is used to make a toast
        val toast = Toast.makeText(this, "This is a toast", Toast.LENGTH_LONG);

        /// findViewById returns us any view, it can be anything, button, textviews, entire view, etc.
        /// <Button> specifies the type of the view
        /// R.id.button1 is a way to get the button with the id button1
        val button1 = findViewById<Button>(R.id.button1);

        button1.setOnClickListener {
            val textView1 = findViewById<TextView>(R.id.textView1);
            /// does not accept single quotes
            textView1.text = "clicked on me";

            toast.show();
        }
    }
}