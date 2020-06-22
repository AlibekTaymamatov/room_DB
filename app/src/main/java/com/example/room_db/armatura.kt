package com.example.room_db

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "armatura_table")

class armatura(

    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "armatura")

    val diameter: Int, //диаметр
    val qty: Int, //кол-во
    val weight: Int, //вес
    val price: Int, //цена
    val horizontal_length: Int, //длина по вертикали
    val vertical_length: Int //длина по горизонтали

)