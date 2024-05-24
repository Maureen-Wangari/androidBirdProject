package com.example.hellowroldanitab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class fifth_bird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_bird)

        val btnPrev5 = findViewById<ImageView>(R.id.btnPrev5)

        btnPrev5.setOnClickListener {
            finish()
        }
    }
}