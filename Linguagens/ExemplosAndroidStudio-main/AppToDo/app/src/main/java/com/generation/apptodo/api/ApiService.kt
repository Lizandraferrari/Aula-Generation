package com.generation.apptodo.api

import com.generation.apptodo.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>

}