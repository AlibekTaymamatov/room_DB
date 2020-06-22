package com.example.room_db

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "beton_table")

class beton(

    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "beton")

    val marka: String?, //ширина
    val class_betona: String? //длина
)