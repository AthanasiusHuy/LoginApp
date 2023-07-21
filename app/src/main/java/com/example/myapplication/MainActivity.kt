package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextActivity = findViewById<Button>(R.id.start_button)
        nextActivity.setOnClickListener {
            setContentView(R.layout.login)
        }
    }
}