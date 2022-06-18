package com.generation.viewmodelelivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.generation.viewmodelelivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var  mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModel = ViewModelProvider(this)
            .get(MainViewModel :: class.java)

        mainViewModel.cont.observe(this){
            binding.textViewContador.text = it.toString()
        }
        /*

        BLOCO DE CÓDIGO QUE NÃO SALVA OS DADOS (SEM VIEWMODEL)

        var cont = 0
        val buttonClique = findViewById<Button>(R.id.buttonClique)
        buttonClique.setOnClickListener {
        cont++
        val contador = findViewById<TextView>(R.id.textViewContador)
        contador.text = cont.toString()
        }

        */
        //binding.textViewContador.text = mainViewModel.cont.toString() -Removido na implementação do LiveData
        binding.buttonAdd.setOnClickListener{
            //cont++ -contador antigo
            mainViewModel.add()
            //binding.textViewContador.text = mainViewModel.cont.toString() -Removido na implementação do LiveData
        }
        binding.buttonZerar.setOnClickListener{
            mainViewModel.zerar()
        }
        binding.buttonSub.setOnClickListener{
            mainViewModel.sub()
        }
        }
    }
