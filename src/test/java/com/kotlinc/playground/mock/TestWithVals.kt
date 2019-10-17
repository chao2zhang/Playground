package com.kotlinc.playground.mock

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import org.junit.Assert
import org.junit.Test

/**
 * This test uses val with mockito-kotlin
 */
class TestWithVals {

    private val userManager = mock<UserManager> {
        on {getUserName(1)} doReturn  "U"
    }
    private val networkManager = mock<NetworkManager> {
        on {fetchFeed(1)} doReturn listOf("A", "B", "D", "C")

    }
    private val application: Application = Application(userManager, networkManager)

    @Test
    fun shouldGreet() {
        Assert.assertEquals("Welcome U!", application.greet(1))
    }

    @Test
    fun shouldFeed() {
        Assert.assertEquals("A, B, C, D", application.feed(1))
    }
}
