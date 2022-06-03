package com.example.domain

import com.example.domain.model.BreakingNewsDomainModel

class SaveBreakingNewsUseCase(
    private val repository: DomainRepository
) {
    suspend fun execute(breakingNewsDomainModel: BreakingNewsDomainModel) =
        repository.saveFavoriteBreakingNews(breakingNewsDomainModel)
}