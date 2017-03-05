package com.acv.gymlog.infraestructure.di.module

import android.content.Context
import com.acv.gymlog.infraestructure.di.qualifier.AppQualifier
import com.acv.gymlog.infraestructure.ui.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val app: App) {

    @Provides @Singleton
    fun provideApplication(): App = app

    @Provides @Singleton @AppQualifier
    fun provideApplicationContext(): Context = app
}