package com.acv.gymlog.infraestructure.di

import com.acv.gymlog.infraestructure.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AppModule::class
))
interface AppComponent {
}

