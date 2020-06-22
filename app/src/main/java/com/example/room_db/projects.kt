package com.example.room_db

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "projects_table")

class projects(

    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "projects")  val name_type: String

)