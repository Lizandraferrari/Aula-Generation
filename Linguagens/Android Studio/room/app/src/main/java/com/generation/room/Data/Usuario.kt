package com.generation.room.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

//vamos declarar uma tabela com base nas variaveis colocadas.
@Entity(tableName = "user_table")
//o @Entity serve para identificar a classe como uma tabela. Devemos nomear a mesma.
data class Usuario(


    @PrimaryKey(autoGenerate = true)
    val id: Long,
    var nome: String,
    var sobrenome: String,
    var idade: Int
    //agora vamos criar uma interface DAO, para mexer com as informações de usuário.
    //Seu nome é UsarDao
) {
}