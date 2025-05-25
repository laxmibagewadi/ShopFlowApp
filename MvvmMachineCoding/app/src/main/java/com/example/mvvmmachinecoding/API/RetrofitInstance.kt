package com.example.mvvmmachinecoding.API

import com.example.mvvmmachinecoding.util.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    companion object{

       private val instance by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val api by lazy{
            instance.create(Api::class.java)
        }

    }
}