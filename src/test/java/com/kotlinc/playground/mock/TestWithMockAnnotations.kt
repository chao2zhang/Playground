package com.kotlinc.playground.mock

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import com.nhaarman.mockitokotlin2.whenever
import org.mockito.MockitoAnnotations

/**
 * This test uses @Mock and lateinit
 */
class TestWithMockAnnotations {

    @Mock lateinit var userManager: UserManager
    @Mock lateinit var networkManager: NetworkManager
    lateinit var application: Application


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
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
