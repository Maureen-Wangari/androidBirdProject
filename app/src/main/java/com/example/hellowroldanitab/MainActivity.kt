package com.example.hellowroldanitab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext =findViewById<ImageView>(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent(this,SecondBirdActivity::class.java)
            startActivity(intent)
        }
    }
}