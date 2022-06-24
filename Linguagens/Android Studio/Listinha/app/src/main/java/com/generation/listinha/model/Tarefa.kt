package com.generation.listinha.model

data class Tarefa (
    var id: Long,
    var nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
//objeto tipo categoria, por isso não é string e foi feita numa classe
    var categoria: Categoria
    )

{

}