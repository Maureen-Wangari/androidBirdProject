package com.example.hellowroldanitab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class fourth_bird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_bird)

        val btnPrev4 = findViewById<ImageView>(R.id.btnPrev4)
        val btnNext4 = findViewById<ImageView>(R.id.btnNext4)

        btnPrev4.setOnClickListener {
            finish()
        }
        btnNext4.setOnClickListener {
            val intent = Intent(this,fifth_bird::class.java)
            startActivity(intent)
        }
    }
    }
