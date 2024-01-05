package com.example.recycleviewfilms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class FilmDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_details)
        val btnBack: Button = findViewById(R.id.btnBack)

        val script = intent.getStringExtra("script")
        val tvScript: TextView = findViewById(R.id.tvScript)
        tvScript.text = script
        btnBack.setOnClickListener{finish()}
    }

}