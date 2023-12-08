package com.tania.jaspher.block3.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent

class Computation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computation)

        val editTextWeight: EditText = findViewById(R.id.editTextWeight)
        val editTextHeight: EditText = findViewById(R.id.editTextHeight)
        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        btnCalculate.setOnClickListener{
            calculateBMI(editTextWeight.text.toString(), editTextHeight.text.toString(), textViewResult)
        }
    }

    private fun calculateBMI(weight: String, height: String, resultTextView: TextView) {
        if(weight.isNotEmpty() && height.isNotEmpty()) {
            val weightValue = weight.toFloat()
            val heightValue = height.toFloat() / 100
            val bmi = weightValue / (heightValue * heightValue)

            val result = when {
                bmi < 18.5 -> "You are Underweight"
                bmi < 24.9 -> "You have a Normal Weight"
                bmi < 29.9 -> "You are Overweight"
                else -> "You are Obese"

            }

            val formattedResult = "BMI: ${String.format("%.2f", bmi)}\nCategory: $result"

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("bmiResult", formattedResult)
            startActivity(intent)

        } else {
            resultTextView.text = "Enter a valid height and weight."
        }
    }
}