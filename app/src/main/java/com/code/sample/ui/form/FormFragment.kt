package com.code.sample.ui.form

import android.view.LayoutInflater
import android.view.ViewGroup
import com.code.sample.R
import com.code.sample.base.BaseFragment
import com.code.sample.databinding.FragmentFormBinding

class FormFragment : BaseFragment<FragmentFormBinding>() {

    override fun getLayoutId(): Int  = R.layout.fragment_form

    override fun getVariablesToBind(): Map<Int, Any> = emptyMap()

    override fun initObservers() {
    }

    override fun initView(inflater: LayoutInflater, container: ViewGroup?) {
        super.initView(inflater, container)
    }

}