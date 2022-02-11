package com.a.paleoaiprecipes.ui

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.a.paleoaiprecipes.R
import com.a.paleoaiprecipes.databinding.ActivityMainBinding
import kotlin.concurrent.fixedRateTimer


class MainActivity : BaseActivity() {
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, binding.amDrawerLayout,
                R.string.nav_open,
                R.string.nav_close
            )

        binding.amDrawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        } else {
            when (item.itemId) {
                R.id.nav_menu -> {
                    val fm: FragmentManager = supportFragmentManager
                    val ft: FragmentTransaction = fm.beginTransaction()
                    ft.add(R.id.amDetailContainer, PaleoRecipesFragment(), "PaleoRecipesFr")
                    ft.addToBackStack(null)
                    ft.commit()
                    Log.d("ActionItemClicked", "nav_menu")

                    return true
                }
                R.id.nav_about -> {
                    Log.d("ActionItemClicked", "Share clicked")
                    return true
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }
}