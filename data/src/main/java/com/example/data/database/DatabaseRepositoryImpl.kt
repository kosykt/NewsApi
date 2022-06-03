package com.example.data.database

import com.example.data.database.model.FavoriteNewsEntity
import com.example.data.repository.DatabaseRepository
import kotlinx.coroutines.flow.Flow

class DatabaseRepositoryImpl(
    private val database: AppDatabase
) : DatabaseRepository {
    override suspend fun saveFavoriteBreakingNews(breakingNewsEntity: FavoriteNewsEntity) {
        database.favoriteNewsDao.insert(breakingNewsEntity)
    }

    override suspend fun deleteFavoriteBreakingNews(breakingNewsEntity: FavoriteNewsEntity) {
        database.favoriteNewsDao.delete(breakingNewsEntity)
    }

    override fun getAllFavoriteBreakingNews(): Flow<List<FavoriteNewsEntity>> {
        return database.favoriteNewsDao.getAll()
    }
}