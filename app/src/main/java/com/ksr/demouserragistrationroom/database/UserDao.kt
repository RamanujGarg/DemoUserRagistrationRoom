package com.ksr.demouserragistrationroom.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ksr.demouserragistrationroom.data.UserRegistration

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addUser(user: UserRegistration)

    @Delete
    suspend fun removeUser(user: UserRegistration)

    @Update
    suspend fun updateUser(user: UserRegistration)

    @Query("Select * From `User Table`")
    fun getAllUser(): LiveData<List<UserRegistration>>
}