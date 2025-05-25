package com.example.dependency_injectiondagger.di

import com.example.dependency_injectiondagger.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class,ActivityBuilderModule::class]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: BaseApplication):Builder

        fun build():AppComponent

    }
}