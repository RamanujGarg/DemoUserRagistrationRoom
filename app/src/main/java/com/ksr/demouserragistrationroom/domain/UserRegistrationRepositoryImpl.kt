package com.ksr.demouserragistrationroom.domain

import androidx.lifecycle.LiveData
import com.ksr.demouserragistrationroom.data.UserRegistration
import com.ksr.demouserragistrationroom.database.UserDao

class UserRegistrationRepositoryImpl(private val userDao: UserDao):UserRegistrationRepository {
    override suspend fun addUser(user: UserRegistration) = userDao.addUser(user)

    override suspend fun updateUser(user: UserRegistration) = userDao.updateUser(user)

    override suspend fun removeUser(user: UserRegistration) = userDao.removeUser(user)

    override fun getAllUser(): LiveData<List<UserRegistration>> = userDao.getAllUser()
}