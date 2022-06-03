package com.example.data.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FavoriteNewsEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
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
