package com.generation.listinha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.generation.listinha.databinding.FragmentFormularioBinding


class FormularioFragment : Fragment() {

    private lateinit var binding: FragmentFormularioBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormularioBinding.inflate(layoutInflater, container, false)


        binding.buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.action_formularioFragment_to_listaFragment2)
        }

        return binding.root
    }


}