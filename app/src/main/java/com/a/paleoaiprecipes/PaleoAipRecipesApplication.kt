package com.a.paleoaiprecipes

import android.app.Application
import com.a.paleoaiprecipes.di.components.AppComponent
import com.a.paleoaiprecipes.di.components.DaggerAppComponent
import com.a.paleoaiprecipes.di.module.AppModule

class PaleoAipRecipesApplication: Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initializeInjector()
        //Timber.plant(HyperlinkedDebugTree())
    }

    private fun initializeInjector() {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
        appComponent.inject(this)
    }

}