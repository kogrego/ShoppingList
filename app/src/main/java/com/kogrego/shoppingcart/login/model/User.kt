package com.kogrego.shoppingcart.login.model

import android.util.Patterns

data class User(
    val email: String,
    val password: String
) {
    fun isEmailValid(): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }


    fun isPasswordLengthGreaterThan5(): Boolean {
        return password.length > 5
    }
}