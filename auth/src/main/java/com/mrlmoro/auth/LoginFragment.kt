package com.mrlmoro.auth

import android.os.Bundle
import android.view.View
import com.mrlmoro.core.BaseFragment
import com.mrlmoro.core.deepLinkNavigate
import com.mrlmoro.core.getSlideNavOptionBuilder
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : BaseFragment() {

    override fun getLayoutRes(): Int = R.layout.fragment_login

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt_login.setOnClickListener {
            Session.isLogged = true

            deepLinkNavigate(
                resId = R.string.dl_feature1,
                navOptions = getSlideNavOptionBuilder()
                    .setPopUpTo(R.id.nav_auth, true)
                    .build()
            )
        }
    }

}