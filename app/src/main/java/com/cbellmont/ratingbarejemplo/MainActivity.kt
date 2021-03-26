package com.cbellmont.ratingbarejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cbellmont.ratingbarejemplo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Toast.makeText(this, "Hay ${binding.ratingBar.rating} seleccionadas", Toast.LENGTH_LONG).show()
        }
        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, fl, b ->
            binding.tvStarSelected.text = "Hay ${fl} estrellas selecionadas"
        }

    }
}