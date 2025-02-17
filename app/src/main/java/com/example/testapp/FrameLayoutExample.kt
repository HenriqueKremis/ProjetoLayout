package com.example.testapp

import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.FrameLayoutExampleBinding

class FrameLayoutExample: AppCompatActivity() {

    private lateinit var binding: FrameLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FrameLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var button: Button
        button = findViewById(R.id.button)
        var cont = 1;

        var imageView: ImageView
        imageView = findViewById(R.id.imageView)

        button.setOnClickListener {
            when (cont) {
                1 -> imageView.setImageResource(R.drawable.suarez1)
                2 -> imageView.setImageResource(R.drawable.suarez2)
                3 -> imageView.setImageResource(R.drawable.suarez3)
            }

            if (cont == 3) {
                cont = 1;
            } else {
                cont++;
            }
        }
    }
}