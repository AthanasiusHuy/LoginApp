package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val nextActivity = findViewById<Button>(R.id.login_button)
        nextActivity.setOnClickListener {
            setContentView(R.layout.login_otp)
        }
    }
}