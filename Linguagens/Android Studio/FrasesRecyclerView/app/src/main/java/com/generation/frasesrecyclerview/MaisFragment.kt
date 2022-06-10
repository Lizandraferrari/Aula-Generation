package com.generation.frasesrecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.generation.frasesrecyclerview.databinding.FragmentFrasesBinding

class MaisFragment : Fragment() {
    private lateinit var binding: FragmentFrasesBinding
    //vamos precisar configurar esse fragmento também para colocar no nav_graph
    //então passamos a informação do frases pelo binding no root para dentro dessa classe

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFrasesBinding.inflate(layoutInflater,container, false)
        //adicionamos a função de criar exibição segundo infor,ações do frases,
        binding.buttonAdd.setOnClickListener {
            findNavController().navigate(R.id.Salvar)
//adicionamos a função do botão salvar, para colocar as informações novas segundo o fragment
//e referenciamos a ação do botão ao retorno da aba inicial com as frases prontas por meio do
//componente de navegação criado e sua id criada por lá.
        }
        return binding.root
        //para o resultado da função ser baseado nas info puxada pelo root
    }

}