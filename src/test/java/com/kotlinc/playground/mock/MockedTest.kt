package com.kotlinc.playground.mock

import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

/**
 * This test uses @Mock and lateinit
 */
class MockedTest {

    @Mock
    lateinit var easy : String

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun test() {
        assertTrue(1 > 0)
        assertNotNull(easy)
    }

    @Test
    fun test2() {
        assertTrue(2 > 0)
    }
}
