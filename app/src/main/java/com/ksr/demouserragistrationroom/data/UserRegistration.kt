package com.ksr.demouserragistrationroom.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User Table")
data class UserRegistration(
    @PrimaryKey(autoGenerate = true) val id:Int? = 0,
    @ColumnInfo(name = "name") val name:String = "",
    @ColumnInfo(name = "email") val email:String = "",
    @ColumnInfo(name = "password") val password:String = "",
    @ColumnInfo(name = "mobileNumber") val mobileNumber:String = ""
)
