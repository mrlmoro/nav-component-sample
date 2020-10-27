package com.mrlmoro.feature1

import android.os.Bundle
import android.view.View
import com.mrlmoro.core.BaseFragment
import kotlinx.android.synthetic.main.fragment_feature1.*

class Feature1DetailsFragment : BaseFragment() {

    override fun getLayoutRes(): Int = R.layout.fragment_feature1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_description.setText(R.string.feature1_details)
        bt_feature_details.visibility = View.GONE
    }

}