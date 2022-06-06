package com.generation.pegueepanc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GatosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gatos)

        val buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}