package com.example.artbook.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.artbook.data.model.Art

@Dao
interface ArtDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArt(art: Art)

    @Delete
    suspend fun deleteArt(art: Art)

    @Query("SELECT * FROM art_table")
    fun observeArts(): LiveData<List<Art>>
}