package com.example.room_db

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "uteplitel_table")

class uteplitel(

    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "uteplitel") val ut_name: String,

    val width: Int, //ширина
    val length: Int, //длина
    val height: Int, //высота
    val qty: String?, //кол-во
    val price: String? //цена
)