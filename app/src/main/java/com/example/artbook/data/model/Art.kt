package com.example.artbook.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "art_table")
data class Art(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var artName: String,
    var artistName: String,
    var artYear: Int,
    var imageUrl: String
)