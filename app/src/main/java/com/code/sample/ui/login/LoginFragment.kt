package com.code.sample.ui.login

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.code.sample.R
import com.code.sample.base.BaseFragment
import com.code.sample.databinding.FragmentLoginBinding
import com.code.sample.domain.LoginResponse
import com.code.sample.utils.livedata.Event
import com.code.sample.webservice.utils.getErrorMessage
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment : BaseFragment<FragmentLoginBinding>() {


    private val viewModel: LoginViewModel by viewModel()

    private val loginObserver = Observer<Event<LoginResponse>> {
        onLoginResult(it)
    }

    override fun getLayoutId(): Int = R.layout.fragment_login

    override fun getVariablesToBind(): Map<Int, Any> = emptyMap()

    override fun initObservers() {
        viewModel.isLoadingEvent.observe(viewLifecycleOwner, isLoadingObserver)
        viewModel.loginEvent.observe(viewLifecycleOwner, loginObserver)
    }

    override fun initView(inflater: LayoutInflater, container: ViewGroup?) {
        super.initView(inflater, container)
        initListeners()

    }

    private fun initListeners() {
        dataBinding.btnLogin.setOnClickListener {

            val email = dataBinding.etEmail.text.toString()
            val password = dataBinding.etPassword.text.toString()

            viewModel.loginEmailAndPassword(
                email = email,
                password = password
            )
        }
    }

    private fun onLoginResult(result: Event<LoginResponse>) {
        when (result) {

            is Event.Success -> {
                onLoginSuccess(result.data)
            }

            is Event.Failure -> {
                onLoginFailure(result.throwable)

            }
        }
    }

    private fun onLoginSuccess(data: LoginResponse) {
        findNavController().navigate(LoginFragmentDirections.actionLoginDestToWelcomeFragment())
    }

    fun onLoginFailure(throwable: Throwable) {
        showAlert(throwable.getErrorMessage(requireContext()))
    }

}