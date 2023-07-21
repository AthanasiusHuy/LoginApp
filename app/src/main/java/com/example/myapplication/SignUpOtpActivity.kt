package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpOtpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val nextActivity = findViewById<Button>(R.id.signup_next_button)
        nextActivity.setOnClickListener {
            setContentView(R.layout.otp_signup)
        }
    }
}