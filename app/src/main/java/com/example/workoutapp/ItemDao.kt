package com.example.workoutapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ItemDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addItem(item:Workout_Item)

    @Delete
    fun deleteItem(vararg item:Workout_Item)

    @Query("SELECT * FROM Items")
    fun getItems() : LiveData<List<Workout_Item>>

    @Query("SELECT * FROM items WHERE ID lIKE :id")
    fun getItem(id:Int): Workout_Item

}