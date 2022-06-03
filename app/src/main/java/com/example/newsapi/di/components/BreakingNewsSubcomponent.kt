package com.example.newsapi.di.components

import com.example.newsapi.di.annotations.BrakingNewsScope
import com.example.newsapi.di.modules.scopes.BreakingNewsModule
import com.example.newsapi.ui.breakingnewsfragment.BreakingNewsFragment
import dagger.Subcomponent

@BrakingNewsScope
@Subcomponent(modules = [BreakingNewsModule::class])
interface BreakingNewsSubcomponent {

    fun inject(fragment: BreakingNewsFragment)
}