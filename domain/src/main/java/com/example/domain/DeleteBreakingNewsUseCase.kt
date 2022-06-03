package com.example.domain

import com.example.domain.model.BreakingNewsDomainModel

class DeleteBreakingNewsUseCase(
    private val repository: DomainRepository
) {
    suspend fun execute(breakingNewsDomainModel: BreakingNewsDomainModel) =
        repository.deleteFavoriteBreakingNews(breakingNewsDomainModel)
}