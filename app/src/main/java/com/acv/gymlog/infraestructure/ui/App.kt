package com.acv.gymlog.infraestructure.ui

import android.app.Application
import com.acv.gymlog.infraestructure.di.AppComponent
import com.acv.gymlog.infraestructure.di.DaggerAppComponent
import com.acv.gymlog.infraestructure.di.module.AppModule

class App : Application() {
    companion object {
        lateinit var graph: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        initializeDagger()
    }

    fun initializeDagger() {
        graph = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}
