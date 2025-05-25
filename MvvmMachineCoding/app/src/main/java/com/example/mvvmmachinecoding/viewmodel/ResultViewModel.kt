package com.example.mvvmmachinecoding.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmmachinecoding.model.Resultdata
import com.example.mvvmmachinecoding.repository.ResultRepository
import com.google.gson.Gson
import kotlinx.coroutines.launch
import retrofit2.Response

class ResultViewModel (private val resultRepository: ResultRepository):ViewModel(){

    private val _resultdata:MutableLiveData<List<Resultdata>> = MutableLiveData()
    val resultdata:LiveData<List<Resultdata>> get() = _resultdata

    fun getData() = viewModelScope.launch {
        val response = resultRepository.getResultDetails()
        handleResponseData(response)

    }

    private fun handleResponseData(response: Response<List<Resultdata>>){
         if(response.isSuccessful){
             response.body()?.let { resultresponse->
                 _resultdata.postValue(resultresponse)
                 Log.e("Viewmodel","resposne ${Gson().toJson(resultresponse)}")
             }
         }
    }
}