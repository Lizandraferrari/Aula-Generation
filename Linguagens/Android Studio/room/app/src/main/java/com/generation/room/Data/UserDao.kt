package com.generation.room.Data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

//inserir requisição do banco

@Dao
interface UserDao {
    //vamos criar uma função que adicione as informações de usuario segundo a classe.
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    //(onConflict = OnConflictStrategy.IGNORE) serve para ignorar informações duplicadas
    fun addUser(usuario: Usuario)

    //então vamos inserir uma linha de SQL para selecionar os usuários, junto com uma função
    @Query("SELECT * FROM USER_TABLE ORDER BY id ASC")
    //com essa linha é possivel selecionar todos os usuários por meio do SELECT e
    //ordenando pelo id de forma crescente (ASC)
    fun selectUser(): LiveData<List<Usuario>>
}
//agora precisamos criar um local de armazenamento de dados. será uma classe chamada UserDatabase