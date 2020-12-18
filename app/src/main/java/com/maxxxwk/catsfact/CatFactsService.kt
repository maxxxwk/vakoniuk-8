package com.maxxxwk.catsfact

import retrofit2.Call
import retrofit2.http.GET

interface CatFactsService {
    @GET("facts")
    fun getFacts(): Call<List<Fact>>
}