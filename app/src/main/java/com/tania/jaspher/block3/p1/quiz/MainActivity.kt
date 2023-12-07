package com.tania.jaspher.block3.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val exitButton: Button = findViewById(R.id.bt_exit)
        exitButton.setOnClickListener { exitApp(it) }

    }

        fun exitApp(view: View){
            finish()
        }
}