package com.example.newsapi.ui.breakingnewsfragment

import com.example.newsapi.di.components.BreakingNewsSubcomponent

interface BreakingNewsSubcomponentProvider {

    fun initBreakingNewsSubcomponent(): BreakingNewsSubcomponent
    fun destroyBreakingNewsSubcomponent()
}