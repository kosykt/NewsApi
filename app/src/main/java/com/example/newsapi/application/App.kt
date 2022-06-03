package com.example.newsapi.application

import android.app.Application
import com.example.newsapi.di.components.AppComponent
import com.example.newsapi.di.components.BreakingNewsSubcomponent
import com.example.newsapi.di.components.DaggerAppComponent
import com.example.newsapi.di.modules.singletones.AppModule
import com.example.newsapi.ui.breakingnewsfragment.BreakingNewsSubcomponentProvider

class App : Application(), BreakingNewsSubcomponentProvider {

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    private var breakingNewsSubcomponent: BreakingNewsSubcomponent? = null

    override fun initBreakingNewsSubcomponent() = appComponent
        .provideBreakingNewsSubcomponent()
        .also {
            breakingNewsSubcomponent = it
        }

    override fun destroyBreakingNewsSubcomponent() {
        breakingNewsSubcomponent = null
    }
}