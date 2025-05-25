package com.example.mvvmmachinecoding.UI

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmmachinecoding.R
import com.example.mvvmmachinecoding.repository.ResultRepository
import com.example.mvvmmachinecoding.viewmodel.ResultViewModel
import com.example.mvvmmachinecoding.viewmodel.ResultViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var resultViewModel: ResultViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val respo = ResultRepository()
        val factory = ResultViewModelProvider(respo)
        resultViewModel = ViewModelProvider(this,factory)[ResultViewModel::class.java]


        resultViewModel.getData()

        resultViewModel.resultdata.observe(observer)



    }
}