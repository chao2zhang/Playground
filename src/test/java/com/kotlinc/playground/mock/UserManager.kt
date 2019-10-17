package com.kotlinc.playground.mock

open class UserManager {

    open fun getUserName(id: Int): String = "user$id"
}
