package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val firstName = binding.firstNameText.text.toString()
            val favoriteColor = binding.favoriteColorText.text.toString()
            val favoriteSnack = binding.favoriteSnackText.text.toString()
            val message = "Hi $firstName, your favorite color is $favoriteColor " +
                    "and your favorite snack is $favoriteSnack"

            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}