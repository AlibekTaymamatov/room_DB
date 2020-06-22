package com.example.room_db


import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "shcheben_table")

class shcheben(

    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "shcheben")

    val weight: String?, //вес
    val price: String? //цена
)