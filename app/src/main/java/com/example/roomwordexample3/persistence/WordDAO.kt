package com.example.roomwordexample3.persistence

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WordDao {

//    @Query("SELECT * from word_table ORDER BY word ASC")
//    fun getAllWords(): List<Word>

    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>

//    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @Insert
    fun insert(word: Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()
}