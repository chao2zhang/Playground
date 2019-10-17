package com.kotlinc.playground.mock

class Application constructor(private val userManager: UserManager,
                              private val networkManager: NetworkManager) {

    fun greet(userId: Int) = "Welcome " + userManager.getUserName(userId) + "!"

    fun feed(userId: Int) = networkManager.fetchFeed(userId).sorted().joinToString()
}
