package com.kotlinc.playground.mock

import com.nhaarman.mockitokotlin2.whenever
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock

/**
 * This test uses lateinit vars
 */
class TestWithVals3 {

    lateinit var userManager: UserManager
    lateinit var networkManager: NetworkManager
    lateinit var application: Application

    @Before
    fun setUp() {
        userManager = mock(UserManager::class.java)
        networkManager = mock(NetworkManager::class.java)
        application = Application(userManager, networkManager)
        whenever(userManager.getUserName(1)).thenReturn("U")
        whenever(networkManager.fetchFeed(1)).thenReturn(listOf("A", "B", "D", "C"))
    }

    @Test
    fun shouldGreet() {
        Assert.assertEquals("Welcome U!", application.greet(1))
    }

    @Test
    fun shouldFeed() {
        Assert.assertEquals("A, B, C, D", application.feed(1))
    }
}
