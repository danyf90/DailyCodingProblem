package com.formichelli.dailycodingproblem.day1to100.day41to50

import org.junit.Assert
import org.junit.Test

class Day45Test {
    @Test
    fun solution() {
        val samples = 100000
        val frequency = IntArray(7)
        for (i in 1..samples) {
            ++frequency[Day45.solution() % 7]
        }

        for (i in 0 until 7) {
            Assert.assertEquals("Frequency of ${i + 1} should be around ${1 / 7.0}", 1 / 7.0, frequency[i] / samples.toDouble(), 0.005)
        }
    }
}