package com.isvaso;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SwapVariablesInTwoWithThirdTest {

    @ParameterizedTest
    @MethodSource("intsProvider")
    void swapWithThird(int a, int b) {
        SwapVariablesInTwoWithThird obj = new SwapVariablesInTwoWithThird(a, b);
        obj.swapWithThird();

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