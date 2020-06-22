package com.example.room_db

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "check_table")

class check(

    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "check")

    val name_type: Int,
    val qty: String?, //кол-во
    val price: String?, //цена
    val sum: Int //сумма

)