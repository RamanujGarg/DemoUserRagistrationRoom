package com.ksr.demouserragistrationroom.domain

import androidx.lifecycle.LiveData
import com.ksr.demouserragistrationroom.data.UserRegistration

interface UserRegistrationRepository {
    suspend fun addUser(user:UserRegistration)
    suspend fun updateUser(user:UserRegistration)
    suspend fun removeUser(user:UserRegistration)
    fun getAllUser():LiveData<List<UserRegistration>>
}