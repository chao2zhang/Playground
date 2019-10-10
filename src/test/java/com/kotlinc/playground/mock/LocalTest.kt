package com.kotlinc.playground.mock

import org.junit.Assert.assertNotNull
import org.mockito.Mockito.mock
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * This test requires all objects to be local
 */
class LocalTest {

    @Test
    fun test() {
        val easy = mock(String::class.java)
        assertTrue(1 > 0)
        assertNotNull(easy)
    }

    @Test
    fun test2() {
        assertTrue(2 > 0)
    }
}
