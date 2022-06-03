package com.example.data

import com.example.data.database.model.FavoriteNewsEntity
import com.example.data.network.model.BreakingNewsDTO
import com.example.domain.model.BreakingNewsDomainModel

fun BreakingNewsDTO.toListBreakingNewsDomainModel() = this.articles.map {
    BreakingNewsDomainModel(
        sourceId = it.source?.id.orEmpty(),
        sourceName = it.source?.name.orEmpty(),
        author = it.author.orEmpty(),
        content = it.content.orEmpty(),
        description = it.description.orEmpty(),
        publishedAt = it.publishedAt.orEmpty(),
        title = it.title.orEmpty(),
        url = it.url.orEmpty(),
        urlToImage = it.urlToImage.orEmpty(),
    )
}

fun List<FavoriteNewsEntity>.toListBreakingNewsDomainModel() = this.map {
    BreakingNewsDomainModel(
        sourceId = it.sourceId,
        sourceName = it.sourceName,
        author = it.author,
        content = it.content,
        description = it.description,
        publishedAt = it.publishedAt,
        title = it.title,
        url = it.url,
        urlToImage = it.urlToImage,
    )
}

fun BreakingNewsDomainModel.toFavoriteNewsEntity() = FavoriteNewsEntity(
    sourceId = this.sourceId,
    sourceName = this.sourceName,
    author = this.author,
    content = this.content,
    description = this.description,
    publishedAt = this.publishedAt,
    title = this.title,
    url = this.url,
    urlToImage = this.urlToImage,
)