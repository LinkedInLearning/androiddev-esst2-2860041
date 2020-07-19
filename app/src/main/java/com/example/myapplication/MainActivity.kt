package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val email = binding.emailAddress.text.toString()
            val password = binding.password.text.toString()
            val message = getString(R.string.message_text, email, password)

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            Log.i("MainActivity", message)
        }
    }
}