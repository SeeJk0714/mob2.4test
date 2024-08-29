package com.seejiekai.mob24test.core.util

object ValidationUtil {
    fun  ValidationEmail(email: String): Boolean {
        val reg = Regex("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9-.]+$")
        return reg.matches(email)
    }
}