package com.example.hellowroldanitab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ThirdBirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_bird)

        val btnPrev3 = findViewById<ImageView>(R.id.btnPrev3)
        val btnNext3 = findViewById<ImageView>(R.id.btnNext3)

        btnPrev3.setOnClickListener {
            finish()
        }
        btnNext3.setOnClickListener {
            val intent = Intent(this,fourth_bird::class.java)
            startActivity(intent)
        }
    }
    }
