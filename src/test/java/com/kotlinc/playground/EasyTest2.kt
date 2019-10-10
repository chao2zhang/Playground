package com.kotlinc.playground

import org.junit.Assert.assertNotNull
import org.mockito.Mockito.mock
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class EasyTest2 {

    lateinit var easy : Easy

    @Before
    fun setUp() {
        easy = mock(Easy::class.java)
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
