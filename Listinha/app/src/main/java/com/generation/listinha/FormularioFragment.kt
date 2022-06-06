package com.generation.listinha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FormularioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_formulario, container, false)

        val buttonSalvar = view.findViewById<Button>(R.id.buttonSalvar)

        buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.action_formularioFragment_to_listaFragment2)
        }

        return view
    }


}