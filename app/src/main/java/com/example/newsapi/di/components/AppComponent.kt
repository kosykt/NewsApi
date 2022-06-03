package com.example.newsapi.di.components

import com.example.newsapi.di.modules.ViewModelModule
import com.example.newsapi.di.modules.singletones.AppModule
import com.example.newsapi.di.modules.singletones.RetrofitModule
import com.example.newsapi.di.modules.singletones.RoomModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        RoomModule::class,
        RetrofitModule::class,
        ViewModelModule::class,
    ]
)
interface AppComponent {

    fun provideBreakingNewsSubcomponent(): BreakingNewsSubcomponent
}