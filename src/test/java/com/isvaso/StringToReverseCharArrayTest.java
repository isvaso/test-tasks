package com.isvaso;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class StringToReverseCharArrayTest {

    @ParameterizedTest
    @ValueSource(strings = {"Source", "12345", " ", ""})
    void reverseToCharTest(String sourceString) {
        StringBuilder sb = new StringBuilder(sourceString);
        char[] assertChars = sb.reverse().toString().toCharArray();

        assertArrayEquals(assertChars, StringToReversedCharArray.reverseToChar(sourceString));
    }
}