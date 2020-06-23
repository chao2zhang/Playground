package com.kotlinc.playground.mock

import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito.mock
import com.nhaarman.mockitokotlin2.whenever

/**
 * This test uses val without mockito-kotlin
 */
class TestWithVals {

    private val userManager = mock(UserManager::class.java).apply {
        whenever(getUserName(1)).thenReturn("U")
    }
    private val networkManager = mock(NetworkManager::class.java).apply {
        whenever(fetchFeed(1)).thenReturn(listOf("A", "B", "D", "C"))
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

