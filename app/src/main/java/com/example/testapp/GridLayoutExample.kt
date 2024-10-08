package com.example.testapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.GridLayoutExampleBinding
import kotlin.random.Random

class GridLayoutExample: AppCompatActivity() {

    private lateinit var binding: GridLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GridLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            view ->

            do {
                val cont=0;
                var verifica = false;
                val randomNumber = Random.nextInt(0, 101)
                for (cont in 2..randomNumber-1) {
                    if (randomNumber % cont == 0) {
                        verifica = true;
                    }
                }

                if (verifica == false) {
                    val textView: TextView = findViewById(R.id.textView2)
                    textView.text = "Número primo gerado: $randomNumber"
                }
            } while (verifica == true);
        }
    }
}