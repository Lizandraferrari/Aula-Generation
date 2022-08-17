package com.generation.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD4 = findViewById<Button>(R.id.button_d4)
        val buttonD6 = findViewById<Button>(R.id.button_d6)
        val buttonD8 = findViewById<Button>(R.id.button_d8)
        val buttonD10 = findViewById<Button>(R.id.button_d10)
        val buttonD20 = findViewById<Button>(R.id.button_d20)
        val buttonD100 = findViewById<Button>(R.id.button_d100)

        buttonD4.setOnClickListener {
            reset()
            rolard4()
        }
        buttonD6.setOnClickListener {
            reset()
            rolard6()
        }
        buttonD8.setOnClickListener {
            reset()
            rolard8()
        }
        buttonD10.setOnClickListener {
            reset()
            rolard10()
        }
        buttonD20.setOnClickListener {
            reset()
            rolard20()
        }
        buttonD100.setOnClickListener {
            reset()
            rolard100()
        }

    }
    private fun rolard4 (){
        val rolagem = (1..4).random()
        val resultd4 = findViewById<TextView>(R.id.resultd4)
        resultd4.text = rolagem.toString()
        val image = findViewById<ImageView>(R.id.imaged4)
        when(rolagem){
            1-> image.setImageResource(R.drawable.d41)
            2-> image.setImageResource(R.drawable.d42)
            3-> image.setImageResource(R.drawable.d43)
            4-> image.setImageResource(R.drawable.d44)
        }

    }
    private fun rolard6 (){
        val rolagem = (1..6).random()
        val resultd6 = findViewById<TextView>(R.id.resultd6)
        resultd6.text = rolagem.toString()
        val image = findViewById<ImageView>(R.id.imaged6)
        when(rolagem){
            1-> image.setImageResource(R.drawable.dice_1)
            2-> image.setImageResource(R.drawable.dice_2)
            3-> image.setImageResource(R.drawable.dice_3)
            4-> image.setImageResource(R.drawable.dice_4)
            5-> image.setImageResource(R.drawable.dice_5)
            6-> image.setImageResource(R.drawable.dice_6)
        }

    }
    private fun rolard8 (){
        val rolagem = (1..8).random()
        val resultd8 = findViewById<TextView>(R.id.resultd8)
        resultd8.text = rolagem.toString()
        val image = findViewById<ImageView>(R.id.imaged8)
        when(rolagem){
            1-> image.setImageResource(R.drawable.d81)
            2-> image.setImageResource(R.drawable.d82)
            3-> image.setImageResource(R.drawable.d83)
            4-> image.setImageResource(R.drawable.d84)
            5-> image.setImageResource(R.drawable.d85)
            6-> image.setImageResource(R.drawable.d86)
            7-> image.setImageResource(R.drawable.d87)
            8-> image.setImageResource(R.drawable.d88)
        }

    }
    private fun rolard10 (){
        val rolagem = (1..10).random()
        val resultd10 = findViewById<TextView>(R.id.resultd10)
        resultd10.text = rolagem.toString()
        val image = findViewById<ImageView>(R.id.imaged10)
        when(rolagem){
            1-> image.setImageResource(R.drawable.d10_1)
            2-> image.setImageResource(R.drawable.d10_2)
            3-> image.setImageResource(R.drawable.d10_3)
            4-> image.setImageResource(R.drawable.d10_4)
            5-> image.setImageResource(R.drawable.d10_5)
            6-> image.setImageResource(R.drawable.d10_6)
            7-> image.setImageResource(R.drawable.d10_7)
            8-> image.setImageResource(R.drawable.d10_8)
            9-> image.setImageResource(R.drawable.d10_9)
            10-> image.setImageResource(R.drawable.d10_0)
        }

    }
    private fun rolard20 (){
        val rolagem = (1..20).random()
        val resultd20 = findViewById<TextView>(R.id.resultd20)
        resultd20.text = rolagem.toString()
        val image = findViewById<ImageView>(R.id.imaged20)
        when(rolagem){
            1-> image.setImageResource(R.drawable.d20_1)
            2-> image.setImageResource(R.drawable.d20_2)
            3-> image.setImageResource(R.drawable.d20_3)
            4-> image.setImageResource(R.drawable.d20_4)
            5-> image.setImageResource(R.drawable.d20_5)
            6-> image.setImageResource(R.drawable.d20_6)
            7-> image.setImageResource(R.drawable.d20_7)
            8-> image.setImageResource(R.drawable.d20_8)
            9-> image.setImageResource(R.drawable.d20_9)
            10-> image.setImageResource(R.drawable.d20_10)
            11-> image.setImageResource(R.drawable.d20_11)
            12-> image.setImageResource(R.drawable.d20_12)
            13-> image.setImageResource(R.drawable.d20_13)
            14-> image.setImageResource(R.drawable.d20_14)
            15-> image.setImageResource(R.drawable.d20_15)
            16-> image.setImageResource(R.drawable.d20_16)
            17-> image.setImageResource(R.drawable.d20_17)
            18-> image.setImageResource(R.drawable.d20_18)
            19-> image.setImageResource(R.drawable.d20_19)
            20-> image.setImageResource(R.drawable.d20_20)
        }

    }
    private fun rolard100 (){
        val rolagemdezena = (1..10).random()
        val image_1 = findViewById<ImageView>(R.id.imaged100_1)
        when(rolagemdezena){
            1-> image_1.setImageResource(R.drawable.d10_1)
            2-> image_1.setImageResource(R.drawable.d10_2)
            3-> image_1.setImageResource(R.drawable.d10_3)
            4-> image_1.setImageResource(R.drawable.d10_4)
            5-> image_1.setImageResource(R.drawable.d10_5)
            6-> image_1.setImageResource(R.drawable.d10_6)
            7-> image_1.setImageResource(R.drawable.d10_7)
            8-> image_1.setImageResource(R.drawable.d10_8)
            9-> image_1.setImageResource(R.drawable.d10_9)
            10-> image_1.setImageResource(R.drawable.d10_0)
        }
        val rolagemunidade = (1..10).random()
        val resultd100 = findViewById<TextView>(R.id.resultd100)
        var rolagemTotal = 0
        if(rolagemdezena!=10 ){
            if(rolagemunidade!=10){
                rolagemTotal = rolagemdezena*10 + rolagemunidade
            }else{
                rolagemTotal = rolagemdezena*10
            }


        }else{
            if(rolagemunidade!=10){
                rolagemTotal = rolagemunidade
            }else{
                rolagemTotal = rolagemdezena*10
            }

        }
        resultd100.text = rolagemTotal.toString()
        val image_2 = findViewById<ImageView>(R.id.imaged100_2)
        when(rolagemunidade){
            1-> image_2.setImageResource(R.drawable.d10_1)
            2-> image_2.setImageResource(R.drawable.d10_2)
            3-> image_2.setImageResource(R.drawable.d10_3)
            4-> image_2.setImageResource(R.drawable.d10_4)
            5-> image_2.setImageResource(R.drawable.d10_5)
            6-> image_2.setImageResource(R.drawable.d10_6)
            7-> image_2.setImageResource(R.drawable.d10_7)
            8-> image_2.setImageResource(R.drawable.d10_8)
            9-> image_2.setImageResource(R.drawable.d10_9)
            10-> image_2.setImageResource(R.drawable.d10_0)
        }

    }
    private fun reset(){
        val image_d4 = findViewById<ImageView>(R.id.imaged4)
        val image_d6 = findViewById<ImageView>(R.id.imaged6)
        val image_d8 = findViewById<ImageView>(R.id.imaged8)
        val image_d10 = findViewById<ImageView>(R.id.imaged10)
        val image_d20 = findViewById<ImageView>(R.id.imaged20)
        val image_d100_1 = findViewById<ImageView>(R.id.imaged100_1)
        val image_d100_2 = findViewById<ImageView>(R.id.imaged100_2)
        image_d4.setImageResource(R.drawable.d41)
        image_d6.setImageResource(R.drawable.dice_1)
        image_d8.setImageResource(R.drawable.d81)
        image_d10.setImageResource(R.drawable.d10_1)
        image_d20.setImageResource(R.drawable.d20_1)
        image_d100_1.setImageResource(R.drawable.d10_1)
        image_d100_2.setImageResource(R.drawable.d10_1)
        val resultd4 = findViewById<TextView>(R.id.resultd4)
        resultd4.text = ""
        val resultd6 = findViewById<TextView>(R.id.resultd6)
        resultd6.text = ""
        val resultd8 = findViewById<TextView>(R.id.resultd8)
        resultd8.text = ""
        val resultd10 = findViewById<TextView>(R.id.resultd10)
        resultd10.text = ""
        val resultd20 = findViewById<TextView>(R.id.resultd20)
        resultd20.text = ""
        val resultd100 = findViewById<TextView>(R.id.resultd100)
        resultd100.text = ""

    }

}