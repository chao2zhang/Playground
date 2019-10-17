package com.kotlinc.playground.mock

import org.junit.Assert.assertEquals
import org.mockito.Mockito.mock
import org.junit.Test
import com.nhaarman.mockitokotlin2.whenever

/**
 * This test requires all objects to be local
 */
class TestWithLocals {

    @Test
    fun shouldGreet() {
        val userManager = mock(UserManager::class.java)
        val networkManager = mock(NetworkManager::class.java)
        val application = Application(userManager, networkManager)
        whenever(userManager.getUserName(1)).thenReturn("U")
        assertEquals("Welcome U!", application.greet(1))
    }

    @Test
    fun shouldFeed() {
        val userManager = mock(UserManager::class.java)
        val networkManager = mock(NetworkManager::class.java)
        val application = Application(userManager, networkManager)
        whenever(networkManager.fetchFeed(1)).thenReturn(listOf("A", "B", "D", "C"))
        assertEquals("A, B, C, D", application.feed(1))
    }
}
