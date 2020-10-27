package com.mrlmoro.feature1

import android.os.Bundle
import android.view.View
import com.mrlmoro.core.BaseFragment
import com.mrlmoro.core.deepLinkNavigate
import kotlinx.android.synthetic.main.fragment_feature1.*

class Feature1Fragment : BaseFragment() {

    override fun getLayoutRes(): Int = R.layout.fragment_feature1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt_feature_details.setOnClickListener { deepLinkNavigate(R.string.dl_feature1_details) }
    }

}