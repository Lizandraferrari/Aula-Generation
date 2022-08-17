package com.generation.listinha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.listinha.adapter.TarefaAdapter
import com.generation.listinha.adapter.TaskClickListener
import com.generation.listinha.databinding.FragmentListaBinding
import com.generation.listinha.model.Tarefa

class ListaFragment : Fragment(), TaskClickListener {

    private lateinit var binding: FragmentListaBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainViewModel.listTarefa()

        binding = FragmentListaBinding.inflate(layoutInflater, container, false)

        val tarefaAdapter = TarefaAdapter(this, mainViewModel, requireContext())

        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = tarefaAdapter
        binding.recyclerTarefa.setHasFixedSize(true)


        binding.floatingAdd.setOnClickListener {
            mainViewModel.tarefaSeleciona = null
            findNavController().navigate(R.id.action_listaFragment_to_formularioFragment)
        }
        mainViewModel.myTarefaResponse.observe(viewLifecycleOwner,{
            response -> if(response != null){    //verifica se é nulo, caso sim, dá erro
                tarefaAdapter.setList(response.body()!!)
        }
        })

        return binding.root
    }

    override fun onTaskClickListener(tarefa: Tarefa) {
        mainViewModel.tarefaSeleciona=tarefa
        findNavController().navigate(R.id.action_listaFragment_to_formularioFragment)
    }
}