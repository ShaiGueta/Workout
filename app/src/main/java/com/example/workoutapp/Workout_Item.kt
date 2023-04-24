package com.example.workoutapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Items")
data class Workout_Item(
    @ColumnInfo("Title")
    val title: String,
    @ColumnInfo("Photo")
    val photo: Int,
    @ColumnInfo("Description")
    val description: String,
    @ColumnInfo("Repeats")
    val repeats: String?,
    @ColumnInfo("Weight")
    val weight:String?) {

    @PrimaryKey(autoGenerate = true)
    var id : Int = 0
}