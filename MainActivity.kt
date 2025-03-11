package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            val userInput = editText.text.toString().trim()

            if (userInput.isNotEmpty()) {
                textView.text = "Hello, $userInput"
                textView.visibility = TextView.VISIBLE
            } else {
                textView.text = "Please enter your name"
                textView.visibility = TextView.VISIBLE
            }
        }
    }
}
