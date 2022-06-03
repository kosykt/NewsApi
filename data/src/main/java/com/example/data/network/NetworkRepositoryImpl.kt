package com.example.data.network

import com.example.data.repository.NetworkRepository
import com.example.data.network.model.BreakingNewsDTO

class NetworkRepositoryImpl(
    private val retrofitService: RetrofitService
) : NetworkRepository {

    override suspend fun getBreakingNews(): BreakingNewsDTO {
        return retrofitService.getBreakingNews()
    }
}