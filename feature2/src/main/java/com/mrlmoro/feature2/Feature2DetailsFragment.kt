package com.mrlmoro.feature2

import android.os.Bundle
import android.view.View
import com.mrlmoro.core.BaseFragment
import com.mrlmoro.core.deepLinkNavigate
import com.mrlmoro.core.getSlideNavOptionBuilder
import kotlinx.android.synthetic.main.fragment_feature2.*
import kotlin.random.Random

class Feature2DetailsFragment : BaseFragment() {

    override fun getLayoutRes(): Int = R.layout.fragment_feature2

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_description.text = arguments?.getString("param1")
            .plus(" ")
            .plus(arguments?.getString("param2"))

        toolbar.title = getString(R.string.feature2_details)
            .plus(" ")
            .plus(arguments?.getString("param1"))

        bt_feature_details.setOnClickListener {
            deepLinkNavigate(
                resId = R.string.dl_feature2_details,
                params = mapOf(
                    Pair("param1", Random.nextInt(1000).toString()),
                    Pair("param2", "\uD83D\uDE09")
                ),
                navOptions = getSlideNavOptionBuilder().build()
            )
        }
    }

}