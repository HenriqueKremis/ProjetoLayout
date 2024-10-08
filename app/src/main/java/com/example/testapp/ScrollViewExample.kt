package com.example.testapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ScrollviewExampleBinding

class ScrollViewExample: AppCompatActivity() {

    private lateinit var binding: ScrollviewExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ScrollviewExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener { view ->

            val textView: TextView = findViewById(R.id.textView4)
            textView.text = getString(R.string.loremIpsum)
        }

        binding.button2.setOnClickListener {
                view ->

            val textView: TextView = findViewById(R.id.textView4)
            textView.text = getString(R.string.loremIpsum)
        }

        binding.button3.setOnClickListener {
                view ->

            val textView: TextView = findViewById(R.id.textView4)
            textView.text = getString(R.string.loremIpsum)
        }

        binding.button4.setOnClickListener {
                view ->

            val textView: TextView = findViewById(R.id.textView3)
            textView.text = getString(R.string.loremIpsum)
        }

        binding.button5.setOnClickListener {
                view ->

            val textView: TextView = findViewById(R.id.textView3)
            textView.text = getString(R.string.loremIpsum)
        }

        binding.button6.setOnClickListener {
                view ->

            val textView: TextView = findViewById(R.id.textView3)
            textView.text = getString(R.string.loremIpsum)
        }

        binding.button7.setOnClickListener {
                view ->

            val textView: TextView = findViewById(R.id.textView5)
            textView.text = getString(R.string.loremIpsum)
        }

        binding.button8.setOnClickListener {
                view ->

            val textView: TextView = findViewById(R.id.textView5)
            textView.text = getString(R.string.loremIpsum)
        }

        binding.button9.setOnClickListener {
                view ->

            val textView: TextView = findViewById(R.id.textView5)
            textView.text = getString(R.string.loremIpsum)
        }

    }
}