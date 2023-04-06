package com.isvaso;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ReverseStringWithoutStringMethodsTest {

    @ParameterizedTest
    @MethodSource("stringsProvider")
    void reverseTwoParametersTest(String sourceString, String assertString) {

        assertEquals(assertString, ReverseStringWithoutStringMethods.reverse(sourceString));
    }

    static Stream<Arguments> stringsProvider() {
        return Stream.of(
                arguments(" Source String", "gnirtS ecruoS "),
                arguments("Aa", "aA")
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"ABCDE", "AbCde", " AC/DC "})
    void reverseOneParameterTest(String sourceString) {
        StringBuilder sb = new StringBuilder(sourceString);

        assertEquals(sb.reverse().toString(), ReverseStringWithoutStringMethods.reverse(sourceString));
    }
}