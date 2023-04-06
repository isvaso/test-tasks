package com.isvaso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for FibonacciSeriesGeneratorTest")
class FibonacciSeriesGeneratorTest {

    @Test
    void generateTest() {
        assertEquals(
                "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233",
                FibonacciSeriesGenerator.generate(14));

        assertEquals(
                "0, 1",
                FibonacciSeriesGenerator.generate(2));
    }
}