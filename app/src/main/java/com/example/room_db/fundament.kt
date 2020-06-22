package com.example.room_db

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "fundament_table")

class fundament(

    @PrimaryKey(autoGenerate = true) val id: Int, //Задает имя столбца в таблице
    @ColumnInfo(name = "fundament")

    val width: Int, //ширина
    val length: Int, //длина
    val height: Int //высота

)

