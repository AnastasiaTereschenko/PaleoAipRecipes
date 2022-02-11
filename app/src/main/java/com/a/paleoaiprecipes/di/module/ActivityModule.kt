package com.a.paleoaiprecipes.di.module

import androidx.appcompat.app.AppCompatActivity
import com.a.paleoaiprecipes.di.PerActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule constructor(private val activity: AppCompatActivity) {

    @Provides
    @PerActivity
    fun provideActivity(): AppCompatActivity {
        return activity
    }

}