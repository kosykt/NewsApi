package com.example.data.repository

import com.example.data.database.model.FavoriteNewsEntity
import kotlinx.coroutines.flow.Flow

interface DatabaseRepository {

    suspend fun saveFavoriteBreakingNews(breakingNewsEntity: FavoriteNewsEntity)
    suspend fun deleteFavoriteBreakingNews(breakingNewsEntity: FavoriteNewsEntity)
    fun getAllFavoriteBreakingNews(): Flow<List<FavoriteNewsEntity>>
}