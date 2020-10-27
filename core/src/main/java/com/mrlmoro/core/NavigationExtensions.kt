package com.mrlmoro.core

import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController

fun Fragment.deepLinkNavigate(
    resId: Int,
    params: Map<String, String> = emptyMap(),
    navOptions: NavOptions? = null
) {
    var uri = getString(resId)

    params.forEach {
        uri = uri.replace("{${it.key}}", it.value)
    }

    findNavController().navigate(uri.toUri(), navOptions)
}

fun getSlideNavOptionBuilder() = NavOptions.Builder()
    .setEnterAnim(R.anim.nav_enter_from_right)
    .setExitAnim(R.anim.nav_exit_to_left)
    .setPopEnterAnim(R.anim.nav_enter_from_left)
    .setPopExitAnim(R.anim.nav_exit_to_right)