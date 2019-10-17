package com.kotlinc.playground.mock

open class NetworkManager {

    open fun fetchFeed(userId: Int): List<String> {
        val list = mutableListOf(
                "Netflix wants to defeat TV\n",
                "Google quits virtual reality in real life\n",
                "Apple's $userId iPhone for the other 80%\n",
                "Facebook's 1st big ZuckBucks meeting\n",
                "Waze is a \"buried treasure\"\n")
        list.shuffle()
        return list
    }
}
