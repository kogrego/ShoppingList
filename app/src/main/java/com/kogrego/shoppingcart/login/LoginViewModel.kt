package com.kogrego.shoppingcart.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kogrego.shoppingcart.login.model.User

class LoginViewModel: ViewModel() {

    private val _email = MutableLiveData<String>()
    val email: LiveData<String>
        get() = _email

    private val _password = MutableLiveData<String>()
    val password: LiveData<String>
        get() = _password

    private val _loginFinished = MutableLiveData<Boolean>()
    val loginFinished: LiveData<Boolean>
        get() = _loginFinished

    private val _user = MutableLiveData<User>()
    val user: LiveData<User>
        get() = _user

    fun onClick() {
        val user = User(_email.value ?: "", _password.value ?: "")
        _user.value = user
        _loginFinished.value = true
    }

    fun onClickPerformed() {
        _loginFinished.value = false
    }

    fun validateUser(): Boolean {
        return true
    }

    init {
        _loginFinished.value = false
    }

}