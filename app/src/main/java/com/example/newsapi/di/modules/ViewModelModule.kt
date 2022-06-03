package com.example.newsapi.di.modules

import androidx.lifecycle.ViewModelProvider
import com.example.newsapi.utils.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
interface ViewModelModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}