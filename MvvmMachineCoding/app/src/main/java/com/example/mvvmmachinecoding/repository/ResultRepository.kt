package com.example.mvvmmachinecoding.repository

import com.example.mvvmmachinecoding.API.RetrofitInstance
import com.example.mvvmmachinecoding.model.Resultdata
import retrofit2.Response

class ResultRepository() {

    suspend fun getResultDetails():Response<List<Resultdata>> {
        return RetrofitInstance.api.GetResult()
    }
}