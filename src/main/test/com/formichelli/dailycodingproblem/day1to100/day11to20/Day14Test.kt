package com.formichelli.dailycodingproblem.day1to100.day11to20

import org.junit.Assert
import org.junit.Test

class Day14Test {
    @Test
    fun solution() {
        Assert.assertEquals("Approximated value should be equals to pi up to 3 decimal digits", Math.PI, Day14.solution(), 0.001)
    }
}