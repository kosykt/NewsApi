package com.example.domain

class GetAllFavoriteBreakingNews(
    private val repository: DomainRepository
) {
    fun execute() = repository.getAllFavoriteBreakingNews()
}