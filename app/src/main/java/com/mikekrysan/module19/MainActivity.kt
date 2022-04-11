package com.mikekrysan.module19

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewRomb = findViewById<ViewGroup>(R.id.root)
        val view = layoutInflater.inflate(R.layout.item, viewRomb, false)
        viewRomb.addView(view)

    }
}