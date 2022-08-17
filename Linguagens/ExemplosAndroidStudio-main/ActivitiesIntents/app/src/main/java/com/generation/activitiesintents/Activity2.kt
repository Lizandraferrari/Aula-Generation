package com.generation.activitiesintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        Log.d("Ciclo", "onCreate")
        val buttonPreview = findViewById<Button>(R.id.buttonPreview)
        buttonPreview.setOnClickListener {
            finish()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("Ciclo", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo", "onRestart")
    }

}