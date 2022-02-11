package com.a.paleoaiprecipes.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.a.paleoaiprecipes.di.components.DaggerFragmentComponent
import com.a.paleoaiprecipes.di.components.FragmentComponent

open class BaseFragment: Fragment() {
    var fragmentComponent: FragmentComponent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        fragmentComponent =  DaggerFragmentComponent.builder().activityComponent(
            (context as BaseActivity)
                .activityComponent
        ).build()
        super.onCreate(savedInstanceState)
    }
}