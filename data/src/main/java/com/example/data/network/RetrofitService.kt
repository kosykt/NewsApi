package com.example.data.network

import com.example.data.BuildConfig
import com.example.data.network.model.BreakingNewsDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET("/v2/top-headlines?country=us")
    suspend fun getBreakingNews(
        @Query("apikey") apiKey: String = BuildConfig.NEWS_API_KEY,
    ): BreakingNewsDTO
}