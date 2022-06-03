package com.example.domain

class GetBreakingNewsUseCase(
    private val repository: DomainRepository
) {
    suspend fun execute() = repository.getBreakingNewsFromNetwork()
}