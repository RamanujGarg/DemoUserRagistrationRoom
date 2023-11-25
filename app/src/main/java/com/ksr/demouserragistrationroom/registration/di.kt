package com.ksr.demouserragistrationroom.registration

import org.koin.core.module.Module
import org.koin.dsl.module

fun registrationModule() = listOf<Module>(dataModule, domainModule, presentationModule)

val dataModule = module {  }
val domainModule = module {  }
val presentationModule = module {  }