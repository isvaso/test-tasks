package com.isvaso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("Tests for SwapVariablesInTwoWithoutThirdTest")
class SwapVariablesInTwoWithoutThirdTest {

    @ParameterizedTest
    @MethodSource("intsProvider")
    void swapWithoutThird(int a, int b) {
        SwapVariablesInTwoWithoutThird obj = new SwapVariablesInTwoWithoutThird(a, b);
        obj.swapWithoutThird();

        assertTrue(b == obj.getA() && a == obj.getB());
    }

    static Stream<Arguments> intsProvider() {
        return Stream.of(
                arguments(1, 2),
                arguments(0, 1),
                arguments(85, 55)
        );
    }
}