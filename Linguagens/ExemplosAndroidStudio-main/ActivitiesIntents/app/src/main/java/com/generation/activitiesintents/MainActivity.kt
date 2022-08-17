package com.generation.activitiesintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext = findViewById<Button>(R.id.buttonNext)
        val intentactivity2 = Intent(this, Activity2::class.java)
        buttonNext.setOnClickListener{
            startActivity(intentactivity2)
        }

    }
}