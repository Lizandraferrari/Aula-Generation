package com.generation.room

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.room.Data.UserDatabase
import com.generation.room.Data.UserRepository
import com.generation.room.Data.Usuario
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
/*
//vamos declarar a view model e instanciar o banco de dados nela.
//para isso, precisamos de declarar a ViewModel e inserir o contexto para ler o banco de dados,
class MainViewModel (context: Context): ViewModel(){
//crie variavel para armazenar os dados do banco e invocar elas
    val selectUsers: LiveData<List<Usuario>>
    val repository: UserRepository

    init {
        val userDao = UserDatabase.getDatabase(context).userDao()
//val nomevariavel = ClasseDatabase.getDatabase(variavelqueusoupranomearocontext).interfaceDao
        //assim trazemos as informações do banco de dados a uma variavel, e podemos
        //inicializar as outras variaveis desta classe para armazenar as informações
        repository = UserRepository(userDao)
        selectUsers = repository.selectUsers
    }



    fun addUser(usuario: Usuario){
        //trazer as info de usuario para adicionar coisas do usuario.
        //vamos iniciar uma corrotina e precisamos dos dispatchers por mexer com dados
        viewModelScope.launch(Dispatchers.IO){
            repository.addUser(usuario)
        }
        //após isso, vamos fazer as telas, inserir em um nav graph pra ficar funcional,
        //ativar o binding
    }
}*/


///////////////vamos adaptar a mainview para ficar responsiva ao banco. se liga a diferença


class MainViewModel (application: Application): AndroidViewModel(application){
//vamos utilizar a AndroidViewModel em seu lugar. o "application" é o novo "context"
    val selectUser: LiveData<List<Usuario>>
    val repository: UserRepository

    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        selectUser = repository.selectUser
    }

    fun addUser(usuario: Usuario){
        viewModelScope.launch(Dispatchers.IO){
            repository.addUser(usuario)
        }

    }
}