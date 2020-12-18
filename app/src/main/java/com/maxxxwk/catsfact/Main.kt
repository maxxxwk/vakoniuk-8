package com.maxxxwk.catsfact

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


fun main() {
    val baseURL = "https://cat-fact.herokuapp.com/"
    val retrofit = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val catFactsService = retrofit.create(CatFactsService::class.java)
    catFactsService.getFacts().enqueue(object : Callback<List<Fact>> {
        override fun onResponse(call: Call<List<Fact>>, response: Response<List<Fact>>) {
            val listOfFacts = response.body()
            listOfFacts?.forEach(::println)
        }

        override fun onFailure(call: Call<List<Fact>>, t: Throwable) {
            t.printStackTrace()
        }
    })
    
}