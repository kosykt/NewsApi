package com.example.domain.model

data class BreakingNewsDomainModel(
    val sourceId: String,
    val sourceName: String,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val title: String,
    val url: String,
    val urlToImage: String,
)
