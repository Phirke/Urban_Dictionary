package com.tejas.urbandictionary.common.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tejas.urbandictionary.results.data.source.CachedResultDao
import com.tejas.urbandictionary.results.data.source.dto.CachedResult

@Database(entities = [CachedResult::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun resultDao(): CachedResultDao
}
