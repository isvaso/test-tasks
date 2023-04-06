package com.isvaso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for IsTheNumberPrimeTest")
class IsTheNumberPrimeTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13})
    void checkIsPrimeTrue(int number) {
        assertTrue(IsTheNumberPrime.check(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13})
    void checkIsPrimeFalse(int number) {
        assertTrue(IsTheNumberPrime.check(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 9, 12, 16, 18, 22})
    void checkIsNotPrimeFalse(int number) {
        assertFalse(IsTheNumberPrime.check(number));
    }
}