package com.example.domain

import com.example.domain.model.BreakingNewsDomainModel
import kotlinx.coroutines.flow.Flow

interface DomainRepository {

    suspend fun getBreakingNewsFromNetwork(): List<BreakingNewsDomainModel>
    suspend fun saveFavoriteBreakingNews(breakingNewsDomainModel: BreakingNewsDomainModel)
    suspend fun deleteFavoriteBreakingNews(breakingNewsDomainModel: BreakingNewsDomainModel)
    fun getAllFavoriteBreakingNews(): Flow<List<BreakingNewsDomainModel>>
}