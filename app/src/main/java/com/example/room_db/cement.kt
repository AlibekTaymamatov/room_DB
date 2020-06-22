package com.example.room_db


import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "cement_table")

class cement(

    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "cement")

    val marka: String?, //ширина
    val qty: String?, //кол-во
    val class_betona: String? //длина
)