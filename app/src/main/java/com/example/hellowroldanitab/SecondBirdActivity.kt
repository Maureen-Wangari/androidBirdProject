package com.example.hellowroldanitab

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SecondBirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_bird)

        val btnPrev = findViewById<ImageView>(R.id.btnPrev)
        val btnNext2 = findViewById<ImageView>(R.id.btnNext2)

        btnPrev.setOnClickListener {
            finish()
        }
        btnNext2.setOnClickListener {
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        }
}