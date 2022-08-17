package com.generation.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rolaD6 = findViewById<Button>(R.id.rolaD6)
        rolaD6.setOnClickListener {
            rolaDado(6)
        }
        var rolaD12 = findViewById<Button>(R.id.rolaD12)
        rolaD12.setOnClickListener {
            rolaDado(12)
        }

        var rolaD20 = findViewById<Button>(R.id.rolaD20)
        rolaD20.setOnClickListener {
            rolaDado(20)
        }
    }

    private fun rolaDado(lados: Int) {
        var rolagem = (1..lados).random()
        var textDado = findViewById<TextView>(R.id.textDado)
        textDado.text = rolagem.toString()
        var image = findViewById<ImageView>(R.id.imageView)


            when (rolagem) {

                1 -> {
                    image.setImageResource(R.drawable.biker)
                }
                2 -> {
                    image.setImageResource(R.drawable.yamcha)
                }
                3 -> {
                    image.setImageResource(R.drawable.jaja)
                }
                4 -> {
                    image.setImageResource(R.drawable.patinha)
                }
                5 -> {
                    image.setImageResource(R.drawable.mine)
                }
                6 -> {
                    image.setImageResource(R.drawable.magobolado)
                }
            }

        when (rolagem) {
            1 -> {
                image.setImageResource(R.drawable.biker)
            }
            2 -> {
                image.setImageResource(R.drawable.yamcha)
            }
            3 -> {
                image.setImageResource(R.drawable.mat)
            }
            4 -> {
                image.setImageResource(R.drawable.patinha)
            }
            5 -> {
                image.setImageResource(R.drawable.five)
            }
            6 -> {
                image.setImageResource(R.drawable.kiri)
            }
            7 -> {
                image.setImageResource(R.drawable.esferas)
            }
            8 -> {
                image.setImageResource(R.drawable.xeno)
            }
            9 -> {
                image.setImageResource(R.drawable.vampiro)
            }
            10 -> {
                image.setImageResource(R.drawable.avaiana)
            }
            11 -> {
                image.setImageResource(R.drawable.goku)
            }
            12 -> {
                image.setImageResource(R.drawable.orc)
            }
        }
        when (rolagem) {
            1 -> {
                image.setImageResource(R.drawable.biker)
            }
            2 -> {
                image.setImageResource(R.drawable.yamcha)
            }
            3 -> {
                image.setImageResource(R.drawable.mat)
            }
            4 -> {
                image.setImageResource(R.drawable.patinha)
            }
            5 -> {
                image.setImageResource(R.drawable.five)
            }
            6 -> {
                image.setImageResource(R.drawable.jaja)
            }
            7 -> {
                image.setImageResource(R.drawable.esferas)
            }
            8 -> {
                image.setImageResource(R.drawable.xeno)
            }
            9 -> {
                image.setImageResource(R.drawable.naruto)
            }
            10 -> {
                image.setImageResource(R.drawable.ben_10_em_png_queroimagem_cei_a_crispim__6_)
            }
            11 -> {
                image.setImageResource(R.drawable.inazuma_eleven_png_2)
            }
            12 -> {
                image.setImageResource(R.drawable.cdz)
            }
            13 -> {
                image.setImageResource(R.drawable.jason_voorhees_transparent_png)
            }
            14 -> {
                image.setImageResource(R.drawable.vampiro)
            }
            15 -> {
                image.setImageResource(R.drawable.avaiana)
            }
            16 -> {
                image.setImageResource(R.drawable.fossa)
            }
            17 -> {
                image.setImageResource(R.drawable.bruce)
            }
            18 -> {
                image.setImageResource(R.drawable.ken)
            }
            19 -> {
                image.setImageResource(R.drawable.goku)
            }
            20 -> {
                image.setImageResource(R.drawable.berserk)
            }
        }
    }
}
