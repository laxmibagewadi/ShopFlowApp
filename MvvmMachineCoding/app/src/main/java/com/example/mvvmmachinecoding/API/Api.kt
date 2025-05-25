package com.example.mvvmmachinecoding.API

import com.example.mvvmmachinecoding.model.Resultdata
import retrofit2.Response
import retrofit2.http.GET

interface Api {

   @GET("character")
    suspend fun GetResult():Response<List<Resultdata>>
}