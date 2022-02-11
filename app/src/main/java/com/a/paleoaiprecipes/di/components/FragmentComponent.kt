package com.a.paleoaiprecipes.di.components

import com.a.paleoaiprecipes.di.PerFragment
import com.a.paleoaiprecipes.di.module.FragmentModule
import dagger.Component

@PerFragment
@Component(dependencies = [ActivityComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {
}