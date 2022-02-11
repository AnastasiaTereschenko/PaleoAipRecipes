package com.a.paleoaiprecipes.di.components

import com.a.paleoaiprecipes.ui.MainActivity
import com.a.paleoaiprecipes.di.PerActivity
import com.a.paleoaiprecipes.di.module.ActivityModule
import dagger.Component

@PerActivity
@Component(dependencies = [AppComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)

}