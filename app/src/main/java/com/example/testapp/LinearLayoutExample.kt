package com.example.testapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.LinerLayoutExampleBinding
import kotlin.random.Random

class LinearLayoutExample: AppCompatActivity() {

    private lateinit var binding: LinerLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LinerLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            view ->

            do {
                val randomNumber = Random.nextInt(0, 1001)
                if (randomNumber % 2 == 0) {
                    val textView: TextView = findViewById(R.id.textView)
                    textView.text = "Número par gerado: $randomNumber"
                }
            } while (randomNumber % 2 != 0);
        }
    }
}