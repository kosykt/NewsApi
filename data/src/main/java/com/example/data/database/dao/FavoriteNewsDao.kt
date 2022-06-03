package com.example.data.database.dao

import androidx.room.*
import com.example.data.database.model.FavoriteNewsEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoriteNewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(favoriteNewsEntity: FavoriteNewsEntity)

    @Delete
    suspend fun delete(favoriteNewsEntity: FavoriteNewsEntity)

    @Query("SELECT * FROM FavoriteNewsEntity")
    fun getAll(): Flow<List<FavoriteNewsEntity>>
}