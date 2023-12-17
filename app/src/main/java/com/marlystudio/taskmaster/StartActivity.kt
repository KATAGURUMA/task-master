package com.marlystudio.taskmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

public class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_page)


        val handler = Handler()
        handler.postDelayed(
            Runnable {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }, 3000
        )

        /*
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.vertical_recycler_view, HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()
         */
    }
}