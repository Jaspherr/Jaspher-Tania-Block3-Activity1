package com.tania.jaspher.block3.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val textViewResult: TextView = findViewById(R.id.textViewResult)
        val btnBack: Button = findViewById(R.id.btnBack)

        val result = intent.getStringExtra("bmiResult")
        textViewResult.text = result

        btnBack.setOnClickListener {
            finish()
        }
    }
}