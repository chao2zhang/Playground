package com.kotlinc.playground.mock

import org.junit.Assert.assertNotNull
import org.mockito.Mockito.mock
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * This test may leak the state
 */
class ValTest {

    val easy : String = mock(String::class.java)

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
