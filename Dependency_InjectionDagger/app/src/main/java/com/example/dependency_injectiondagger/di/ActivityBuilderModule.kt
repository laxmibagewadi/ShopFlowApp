package com.example.dependency_injectiondagger.di

import com.example.dependency_injectiondagger.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun bindAuthActivity(): AuthActivity



}