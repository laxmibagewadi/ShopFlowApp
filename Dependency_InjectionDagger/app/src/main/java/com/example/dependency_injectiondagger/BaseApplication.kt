package com.example.dependency_injectiondagger

import com.example.dependency_injectiondagger.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
     return DaggerAppComponent.builder()
         .application(this)
         .build()
    }
}