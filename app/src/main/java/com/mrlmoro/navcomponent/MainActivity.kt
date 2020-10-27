package com.mrlmoro.navcomponent

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.mrlmoro.auth.Session
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val navController: NavController by lazy { findNavController(R.id.fragment_nav_host) }

    override fun onStart() {
        super.onStart()
        verifySession()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNav()
    }

    private fun setupNav() {
        bottom_nav.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.frag_feature1, R.id.frag_feature2 -> bottom_nav.visibility = View.VISIBLE
                else -> bottom_nav.visibility = View.GONE
            }
        }
    }

    private fun verifySession() {
        if (Session.isLogged.not()) {
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.nav_feature1, true)
                .build()
            navController.navigate(getString(R.string.dl_login).toUri(), navOptions)
        }
    }

}