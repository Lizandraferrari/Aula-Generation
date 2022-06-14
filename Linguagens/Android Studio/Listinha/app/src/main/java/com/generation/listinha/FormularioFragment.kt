package com.generation.listinha

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.navigation.fragment.findNavController
import com.generation.listinha.databinding.FragmentFormularioBinding
import com.generation.listinha.fragment.DatePickerFragment
import com.generation.listinha.fragment.TimePickerListener
import com.generation.listinha.model.Categoria
import java.time.LocalDate


class FormularioFragment() : Fragment(), TimePickerListener {

    private lateinit var binding: FragmentFormularioBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    constructor(parcel: Parcel) : this() {

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormularioBinding.inflate(layoutInflater, container, false)

        mainViewModel.listCategoria()

        mainViewModel.dataSelecionada.value = LocalDate.now()

        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
            response -> Log.d("Requisicao", response.body().toString())
            spinnerCategoria(response.body())
        }

        mainViewModel.dataSelecionada.observe(viewLifecycleOwner){
            selectedDate -> binding.editData.setText(selectedDate.toString())
        }

        binding.buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.action_formularioFragment_to_listaFragment2)
        }

        binding.editData.setOnClickListener {
            DatePickerFragment(this)
                .show(parentFragmentManager, "DatePicker")
        }

        return binding.root
    }

    fun spinnerCategoria (listCategoria: List<Categoria>?){
        if (listCategoria != null){
            binding.spinnerCategoria.adapter =
                ArrayAdapter(
                    requireContext(),
                    androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                    listCategoria
                )
        }

    }

    companion object CREATOR : Parcelable.Creator<FormularioFragment> {
        override fun createFromParcel(parcel: Parcel): FormularioFragment {
            return FormularioFragment(parcel)
        }

        override fun newArray(size: Int): Array<FormularioFragment?> {
            return arrayOfNulls(size)
        }
    }

    override fun onDateSelected(date: LocalDate) {
        mainViewModel.dataSelecionada.value = date
    }


}