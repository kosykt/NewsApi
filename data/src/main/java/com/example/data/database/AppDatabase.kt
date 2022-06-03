package com.example.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.database.dao.FavoriteNewsDao
import com.example.data.database.model.FavoriteNewsEntity

@Database(entities = [FavoriteNewsEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract val favoriteNewsDao: FavoriteNewsDao
}