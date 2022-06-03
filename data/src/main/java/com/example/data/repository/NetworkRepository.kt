package com.example.data.repository

import com.example.data.network.model.BreakingNewsDTO

interface NetworkRepository {

    suspend fun getBreakingNews(): BreakingNewsDTO
}