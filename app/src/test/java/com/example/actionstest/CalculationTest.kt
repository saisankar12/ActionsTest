package com.example.actionstest

import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class CalculationTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(5, Calculation().addTwoNumbers(2, 3))
        //assertEquals(4,2+2)
    }


    @Test
    fun subtraction_isCorrect() {
        assertEquals(5, Calculation().subtractTwoNumbers(8, 3))
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(24, Calculation().multiplyTwoNumbers(8, 3))
    }

    @Test
    fun division_isCorrect() {
        assertEquals(3, Calculation().divideTwoNumbers(9, 3))
    }

    @Test
    fun percentage_isCorrect() {
        assertEquals(0.03, Calculation().calculatePercentage(3.0))
    }
}