package com.example.data.network

import com.example.data.BuildConfig
import com.example.data.network.model.BreakingNewsDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET("/v2/top-headlines?country=us")
    suspend fun getBreakingNews(
        /**
         * Для получения данных из REST API необходимо прописать в local.properties
         * слудеющюю строку: NEWS_API_KEY="e8f656fe729842b792d2cbb5d2180b93",
         * либо за хардкодить здесь
         */
        @Query("apikey") apiKey: String = BuildConfig.NEWS_API_KEY,
    ): BreakingNewsDTO
}