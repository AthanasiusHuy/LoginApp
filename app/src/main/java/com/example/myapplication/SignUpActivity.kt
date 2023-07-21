package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val nextActivity = findViewById<Button>(R.id.sign_up_button)
        nextActivity.setOnClickListener {
            setContentView(R.layout.signup)
        }
    }
}