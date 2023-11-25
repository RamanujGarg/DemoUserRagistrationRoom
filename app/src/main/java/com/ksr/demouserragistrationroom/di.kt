package com.ksr.demouserragistrationroom

import android.content.Context
import com.ksr.demouserragistrationroom.database.UserDatabase
import com.ksr.demouserragistrationroom.registration.registrationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

fun appModules():MutableList<Module> {
    val modules = mutableListOf<Module>()
    modules.addAll(registrationModule())
    modules.add(appModule)
    return modules
}

val appModule = module {
    single { provideDb(androidContext()) }
}

private fun provideDb(ctx: Context){
    UserDatabase.getInstance(ctx).getUserDao()
}

private fun provideNetwork(){
}