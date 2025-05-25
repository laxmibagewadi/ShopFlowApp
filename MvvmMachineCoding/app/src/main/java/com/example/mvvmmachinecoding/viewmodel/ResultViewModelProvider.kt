package com.example.mvvmmachinecoding.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmmachinecoding.repository.ResultRepository

class ResultViewModelProvider(private val resultRepository: ResultRepository):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ResultViewModel(resultRepository) as T
    }
}