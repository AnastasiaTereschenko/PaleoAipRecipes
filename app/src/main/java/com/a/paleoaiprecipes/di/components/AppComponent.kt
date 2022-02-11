package com.a.paleoaiprecipes.di.components

import androidx.lifecycle.ViewModelProvider
import com.a.paleoaiprecipes.PaleoAipRecipesApplication
import com.a.paleoaiprecipes.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(application: PaleoAipRecipesApplication)
}