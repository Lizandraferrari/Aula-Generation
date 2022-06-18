package com.generation.listinha.repository

import com.generation.listinha.api.RetrofitInstance
import com.generation.listinha.model.Categoria
import retrofit2.Response

class Repository {
    suspend fun listCategoria():Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }

}