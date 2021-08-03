package com.example.artbook.data

import androidx.room.Database
import com.example.artbook.data.model.Art

@Database(entities = [Art::class], version = 1)
abstract class ArtDatabase {
    abstract fun artDao(): ArtDao
}