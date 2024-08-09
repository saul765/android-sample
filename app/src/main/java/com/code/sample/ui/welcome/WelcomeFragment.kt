package com.code.sample.ui.welcome

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.code.sample.R
import com.code.sample.base.BaseFragment
import com.code.sample.databinding.FragmentWelcomeBinding
import com.code.sample.ui.welcome.adapter.ShopAdapter

class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_welcome

    override fun getVariablesToBind(): Map<Int, Any> = emptyMap()

    override fun initObservers() {
    }

    override fun initView(inflater: LayoutInflater, container: ViewGroup?) {
        super.initView(inflater, container)

        initFloatingActionButton()

        val data = ShopRepository.generateShops()
        dataBinding.rvShops.adapter = ShopAdapter(data = data) {
            Toast.makeText(requireContext(), it.name, Toast.LENGTH_SHORT).show()
        }
    }

    private fun initFloatingActionButton() {
        dataBinding.fab.setOnClickListener {
            findNavController().navigate(WelcomeFragmentDirections.actionWelcomeDestToFormDest())
        }
    }


}