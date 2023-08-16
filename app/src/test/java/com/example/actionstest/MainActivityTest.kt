package com.example.actionstest

import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class MainActivityTest {
    @Test
    fun addition() {
        assertEquals(4, 2+2)
    }
    @Test
    fun multiplication() {
        assertEquals(4, 2*2)
    }
}