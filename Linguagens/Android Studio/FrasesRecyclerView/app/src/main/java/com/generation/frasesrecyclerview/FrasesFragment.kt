package com.generation.frasesrecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.frasesrecyclerview.adapter.FrasesAdapter
import com.generation.frasesrecyclerview.databinding.FragmentFrasesBinding
import com.generation.frasesrecyclerview.model.Frases

class FrasesFragment : Fragment() {

    private lateinit var binding: FragmentFrasesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFrasesBinding.inflate(layoutInflater, container, false)
        val listFrases = listOf(
            Frases(
                "O último capitalista que penduramos será aquele que nos vendeu a corda.",
                "Karl Marx"
            ), Frases(
                "Você pode encontrar as coisas que perdeu, mas nunca as que abandonou.",
                "Gandalf (J.R.R. Tolkien)"
            ), Frases(
                "Para ver muita coisa é preciso despregar os olhos de si mesmo.",
                "Friedrich Nietzsche"
            ), Frases(
                "Quando a educação não é libertadora, o sonho do oprimido é ser o opressor.",
                "Paulo Freire"
            ), Frases(
                "Programação é uma habilidade melhor adquirida pela prática " +
                        "e exemplo em vez de livros.",
                "Alan Turing"
            )
        )
//aqui é onde inicia o adapter e o recycler view, que são puxados pela classe "FrasesAdapter"
//vamos determinar como variável e puxar pelo nome dado a classe que cuida do adapter
        val adapter = FrasesAdapter()
        binding.recyclerFrases.layoutManager = LinearLayoutManager(context)
        binding.recyclerFrases.adapter = adapter
        binding.recyclerFrases.setHasFixedSize(true)
//Declaramos o que iremos reciclar na classe frases (layout, tamanho e a função adapter em si)
        adapter.setList(listFrases)
//Aqui já indicamos que queremos que o setList da lista frases seja transmitida e adaptavel
        binding.buttonAdd.setOnClickListener {
            findNavController().navigate(R.id.Adicionar)
//aqui setamos a informação do botão inicial redirecionar do frases para o mais.
//temos que fazer também manualmente no layout da navigation para poder ser lido a id
        }
        binding.recyclerFrases
        return binding.root
        //aqui informamos o valor por meio do binding para puxar no return da função
    }

    }
