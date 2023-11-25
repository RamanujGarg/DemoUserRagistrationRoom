package com.ksr.demouserragistrationroom.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ksr.demouserragistrationroom.data.UserRegistration

@Database(entities = [UserRegistration::class], exportSchema = false, version = 1)
abstract class UserDatabase: RoomDatabase() {

    abstract fun getUserDao(): UserDao

    companion object{
        private var instance : UserDatabase? = null

        @Synchronized
        fun getInstance(ctx:Context):UserDatabase{
            if (instance == null){
                instance = Room.databaseBuilder(ctx.applicationContext, UserDatabase::class.java, "UserDb")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance!!
        }
    }
}