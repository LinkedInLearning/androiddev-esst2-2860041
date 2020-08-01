package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.avatarSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                binding.avatarImage.load("https://bit.ly/android_dev_image1")
            else
                binding.avatarImage.load("https://bit.ly/android_dev_image2")
        }
    }
}