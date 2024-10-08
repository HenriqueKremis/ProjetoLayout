package com.example.testapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ConstraintLayoutExampleBinding
import kotlin.random.Random

class ConstraintLayoutExample: AppCompatActivity() {

    private lateinit var binding: ConstraintLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ConstraintLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            view ->

            val randomNumber = Random.nextInt(0, 1001)
            val textView: TextView = findViewById(R.id.textView1)
            textView.text = "Número gerado: $randomNumber"
        }
    }
}