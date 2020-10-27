package com.mrlmoro.feature2

import android.os.Bundle
import android.view.View
import com.mrlmoro.core.BaseFragment
import com.mrlmoro.core.deepLinkNavigate
import kotlinx.android.synthetic.main.fragment_feature2.*
import kotlin.random.Random

class Feature2Fragment : BaseFragment() {

    override fun getLayoutRes(): Int = R.layout.fragment_feature2

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt_feature_details.setOnClickListener {
            deepLinkNavigate(
                resId = R.string.dl_feature2_details,
                params = mapOf(
                    Pair("param1", Random.nextInt(1000).toString()),
                    Pair("param2", "\uD83D\uDE00")
                )
            )
        }
    }
}