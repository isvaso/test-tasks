package com.isvaso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for StringToReverseCharArrayTest")
class StringToReverseCharArrayTest {

    @ParameterizedTest
    @ValueSource(strings = {"Source", "12345", " ", ""})
    void reverseToCharTest(String sourceString) {
        StringBuilder sb = new StringBuilder(sourceString);
        char[] assertChars = sb.reverse().toString().toCharArray();

        assertArrayEquals(assertChars, StringToReversedCharArray.reverseToChar(sourceString));
    }
}