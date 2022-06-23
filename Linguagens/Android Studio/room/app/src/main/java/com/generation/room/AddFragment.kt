package com.generation.room

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.generation.room.Data.Usuario
import com.generation.room.databinding.FragmentAddBinding

class AddFragment : Fragment() {
    private lateinit var binding: FragmentAddBinding
    /////////////////////////////////////////////////////////////////LEIA ANOTAÇÃO 1
    private var mainViewModel: MainViewModel 
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(layoutInflater, container, false)

        ////////////////////////////////////////////////////////////////LEIA ANOTAÇÃO 1
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.buttonAdd.setOnClickListener {
            //////////////////////////////////////////////////////////ANOTAÇÃO 2
            inserirNoBanco()
        }
        return binding.root
    }
    //mas antes, vamos verificar se todos os campos estão preenchidos
    private fun verificarCampos(nome: String, sobrenome: String, idade: String): Boolean{
        return !(nome == "" || sobrenome == "" || idade == "")
    }
    //agora vamos criar a função de inserir no banco
    private fun inserirNoBanco(){
        //inserir a opção de "leitura" dos campos pelo usuário,
        val nome = binding.editNome.text.toString()
        val sobrenome = binding.editSobrenome.text.toString()
        val idade = binding.editIdade.text.toString()
    //vamos inicializar a função de verificação pra ver se foi feito corretamente
        if(verificarCampos(nome, sobrenome, idade)) {
            //declarar uma variavel para realizar a inserção de informações conforme a
            //classe objeto Usuario
            val user = Usuario(0, nome, sobrenome, idade.toInt())
            // e agora adaptaremos a viewmodel para a leitura.

            ///////////////////////////////////////////////////////////////////ANOTAÇÃO 1
            //assim que terminarmos, vamos criar uma nova variavel no fragmento para fazer a leitura
            //da main view model, e declarar na função onCreateView
            //agora voltamos aqui após a declaração e continuamos a escrever o código.
            //precisamos trazer a view model pra visualizar, e vamos colocar um toast pra ficar bonito
            mainViewModel.addUser(user)
            Toast.makeText(context, "Adicionado com sucesso!", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.maisum)
            //agora já declaraamos o botão e a condição dos campos.
            //precisamos fazer dar erro caso não tenha todas informações
        }else{
            Toast.makeText(context,"Todos os campos precisam ser preenchidos.", Toast.LENGTH_LONG).show()
        }
        ////////////////////////////////////////////////////////////////ANOTAÇÃO 2
        //Agora vamos inserir essa função dentro do setonclicklistener para ler o botão e
        //executar a função feita.


    }

}



