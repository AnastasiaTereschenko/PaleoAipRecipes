package com.a.paleoaiprecipes.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a.paleoaiprecipes.PaleoAipRecipesApplication
import com.a.paleoaiprecipes.di.components.ActivityComponent
import com.a.paleoaiprecipes.di.components.DaggerActivityComponent
import com.a.paleoaiprecipes.di.module.ActivityModule

open class BaseActivity : AppCompatActivity()  {
    var activityComponent: ActivityComponent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        val dogBreedsApplication = this.applicationContext as PaleoAipRecipesApplication
        activityComponent = DaggerActivityComponent.builder().appComponent(dogBreedsApplication.appComponent).activityModule(
            ActivityModule(
                this
            )
        ).build()
        super.onCreate(savedInstanceState)
    }
}