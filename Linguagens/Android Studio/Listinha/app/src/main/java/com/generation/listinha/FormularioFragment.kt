package com.generation.listinha

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.navigation.fragment.findNavController
import com.generation.listinha.databinding.FragmentFormularioBinding
import com.generation.listinha.fragment.DatePickerFragment
import com.generation.listinha.fragment.TimePickerListener
import com.generation.listinha.model.Categoria
import com.generation.listinha.model.Tarefa
import java.time.LocalDate
class FormularioFragment() : Fragment(), TimePickerListener {

    private lateinit var binding: FragmentFormularioBinding
    private var categoriaSelecionada = 0L
    private val mainViewModel: MainViewModel by activityViewModels()
    private var tarefaSelecionada: Tarefa? = null

    constructor(parcel: Parcel) : this() {
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormularioBinding.inflate(inflater, container, false)

        carregarDados()

        mainViewModel.listCategoria()

        mainViewModel.dataSelecionada.value = LocalDate.now()

        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner) { response ->
            Log.d("Requisicao", response.body().toString())
            spinnerCategoria(response.body())
        }

        mainViewModel.dataSelecionada.observe(viewLifecycleOwner) { selectedDate ->
            binding.editData.setText(selectedDate.toString())
        }

        binding.buttonSalvar.setOnClickListener {
            inserirNoBanco()
        }

        binding.editData.setOnClickListener {
            DatePickerFragment(this)
                .show(parentFragmentManager, "DatePicker")
        }

        return binding.root
    }

    private fun spinnerCategoria (categorias: List<Categoria>?){
        if (categorias != null){
            binding.spinnerCategoria.adapter = ArrayAdapter(
                    requireContext(),
                    R.layout.support_simple_spinner_dropdown_item,
                    categorias
                )
            
            binding.spinnerCategoria.onItemClickListener =
                object : AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
                    override fun onItemSelected(p0: AdapterView<*>?, p1: View, p2: Int, p3: Long){
                        var categoriaSelecionadaFun = binding.spinnerCategoria.selectedItem as Categoria
                        categoriaSelecionada = categoriaSelecionadaFun.id
                    }


                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }

                    override fun onItemClick(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        TODO("Not yet implemented")
                    }


                }
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

    private fun validarCampos(
        nome: String, descricao: String, responsavel:String, data: String): Boolean{

        return !(
                (nome==""||nome.length<3||nome.length>20)||
                (descricao==""||descricao.length<5||descricao.length>200)||
                        (responsavel==""||responsavel.length<3||responsavel.length>20)||
                data=="")

    }

    private fun inserirNoBanco(){
        val nome = binding.editNome.text.toString()
        val desc = binding.editDescricao.text.toString()
        val resp = binding.editResponsavel.text.toString()
        val data = binding.editData.text.toString()
        val status = binding.switchAtivoCard.isChecked
        val categoria = Categoria(categoriaSelecionada, null, null)

        if (validarCampos(nome, desc, resp, data)) {
            val salvar: String
            if (tarefaSelecionada != null) {
                salvar = "Tarefa Atualizada!"
                val tarefa =
                    Tarefa(tarefaSelecionada?.id!!, nome, desc, resp, data, status, categoria)
                mainViewModel.addTarefa(tarefa)
            } else {
                salvar = "Tarefa Criada"
                val tarefa = Tarefa(0, nome, desc, resp, data, status, categoria)
                mainViewModel.addTarefa(tarefa)
        }
            Toast.makeText(context,salvar, Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_formularioFragment_to_listaFragment2)

        }else{
            Toast.makeText(context,"Verifique os campos!", Toast.LENGTH_SHORT).show()

        }

    }

    private fun carregarDados(){
        tarefaSelecionada = mainViewModel.tarefaSeleciona
        if (tarefaSelecionada != null){
            binding.editNome.setText(tarefaSelecionada?.nome)
            binding.editResponsavel.setText(tarefaSelecionada?.responsavel)
            binding.editDescricao.setText(tarefaSelecionada?.descricao)
            binding.editData.setText(tarefaSelecionada?.data)
            binding.switchAtivoCard.isChecked = tarefaSelecionada?.status!!


        }
    }

    override fun onDateSelected(date: LocalDate) {
        mainViewModel.dataSelecionada.value = date
    }


}