package com.example.newsapi.di.modules.scopes

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.domain.*
import com.example.newsapi.di.annotations.BrakingNewsScope
import com.example.newsapi.di.annotations.ViewModelKey
import com.example.newsapi.ui.breakingnewsfragment.BreakingNewsSubcomponentProvider
import com.example.newsapi.ui.breakingnewsfragment.BreakingNewsViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
interface BreakingNewsModule {

    @BrakingNewsScope
    @Binds
    @IntoMap
    @ViewModelKey(BreakingNewsViewModel::class)
    fun bindUsersFragmentViewModel(vm: BreakingNewsViewModel): ViewModel

    companion object {

        @BrakingNewsScope
        @Provides
        fun provideBreakingNewsSubcomponentProvider(
            application: Application
        ): BreakingNewsSubcomponentProvider {
            return (application as BreakingNewsSubcomponentProvider)
        }

        @BrakingNewsScope
        @Provides
        fun provideGetBreakingNewsUseCase(
            domainRepository: DomainRepository
        ): GetBreakingNewsUseCase {
            return GetBreakingNewsUseCase(domainRepository)
        }

        @BrakingNewsScope
        @Provides
        fun provideDeleteBreakingNewsUseCase(
            domainRepository: DomainRepository
        ): DeleteBreakingNewsUseCase {
            return DeleteBreakingNewsUseCase(domainRepository)
        }

        @BrakingNewsScope
        @Provides
        fun provideGetAllFavoriteBreakingNews(
            domainRepository: DomainRepository
        ): GetAllFavoriteBreakingNews {
            return GetAllFavoriteBreakingNews(domainRepository)
        }

        @BrakingNewsScope
        @Provides
        fun provideSaveBreakingNewsUseCase(
            domainRepository: DomainRepository
        ): SaveBreakingNewsUseCase {
            return SaveBreakingNewsUseCase(domainRepository)
        }
    }
}