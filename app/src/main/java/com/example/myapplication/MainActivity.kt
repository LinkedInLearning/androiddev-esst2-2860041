package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addSomeViews(count = 5)
    }

    fun addSomeViews(count: Int) {
        for (i in 1..count) {
            val textView = TextView(this)
            textView.text = "Hey, learner # $i"
            textView.textSize = 20f
            my_layout.addView(textView)
        }

        val button = Button(this)
        button.text = "Click me!"
        my_layout.addView(button)
    }
}