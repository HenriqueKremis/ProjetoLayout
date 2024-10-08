package com.example.testapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.RelativeLayoutExampleBinding
import kotlin.random.Random

class RelativeLayoutExample: AppCompatActivity() {

    private lateinit var binding: RelativeLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = RelativeLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
                view ->

            do {
                val randomNumber = Random.nextInt(0, 1001)
                if (randomNumber % 2 == 1) {
                    val textView: TextView = findViewById(R.id.textView1)
                    textView.text = "Número ímpar gerado: $randomNumber"
                }
            } while (randomNumber % 2 == 0);
        }
    }
}