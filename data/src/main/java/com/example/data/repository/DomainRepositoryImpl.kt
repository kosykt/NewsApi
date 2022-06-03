package com.example.data.repository

import com.example.data.toFavoriteNewsEntity
import com.example.data.toListBreakingNewsDomainModel
import com.example.domain.DomainRepository
import com.example.domain.model.BreakingNewsDomainModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class DomainRepositoryImpl(
    private val networkRepository: NetworkRepository,
    private val databaseRepository: DatabaseRepository,
) : DomainRepository {

    override suspend fun getBreakingNewsFromNetwork(): List<BreakingNewsDomainModel> {
        return networkRepository.getBreakingNews().toListBreakingNewsDomainModel()
    }

    override suspend fun saveFavoriteBreakingNews(breakingNewsDomainModel: BreakingNewsDomainModel) {
        databaseRepository.saveFavoriteBreakingNews(breakingNewsDomainModel.toFavoriteNewsEntity())
    }

    override suspend fun deleteFavoriteBreakingNews(breakingNewsDomainModel: BreakingNewsDomainModel) {
        databaseRepository.deleteFavoriteBreakingNews(breakingNewsDomainModel.toFavoriteNewsEntity())
    }

    override fun getAllFavoriteBreakingNews(): Flow<List<BreakingNewsDomainModel>> {
        return databaseRepository.getAllFavoriteBreakingNews().map {
            it.toListBreakingNewsDomainModel()
        }
    }
}