package com.code.sample.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.code.sample.utils.livedata.Event
import com.code.sample.base.BaseViewModel
import com.code.sample.domain.LoginResponse
import com.code.sample.usecases.ILoginUserAndPasswordUseCase
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginViewModel(private val loginUserAndPasswordUseCase: ILoginUserAndPasswordUseCase) :
    BaseViewModel() {

    val loginEvent = MutableLiveData<Event<LoginResponse>>()


    fun loginEmailAndPassword(email: String, password: String) {
        viewModelScope.launch(contextProvider.getMainContext()) {
            showProgress()

            try {
                val result = withContext(contextProvider.getIoContext()) {
                    loginUserAndPasswordUseCase.execute(email, password)
                }
                loginEvent.value = Event.Success(result)
            } catch (t: Throwable) {
                loginEvent.value = Event.Failure(t)
            } finally {
                hideProgress()
            }
        }
    }
}