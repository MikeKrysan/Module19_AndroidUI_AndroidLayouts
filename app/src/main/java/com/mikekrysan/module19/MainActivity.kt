package com.mikekrysan.module19

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Надувание объекта:
        val viewFigure = findViewById<ViewGroup>(R.id.root)
        val view = layoutInflater.inflate(R.layout.item, viewFigure, false)
        viewFigure.addView(view)


        //Scroll практика:

//        val content = findViewById<ViewGroup>(R.id.content)
//        for(i in 0..100) {
//            val v = layoutInflater.inflate(R.layout.item, content, false)
//            content.addView(v)
//        }
    }
}