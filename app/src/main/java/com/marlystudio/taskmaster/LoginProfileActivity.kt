package com.marlystudio.taskmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_profile)

        findViewById<Button>(R.id.button_connexion).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}