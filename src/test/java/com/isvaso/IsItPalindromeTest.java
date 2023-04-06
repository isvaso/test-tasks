package com.isvaso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for IsItPalindromeTest")
class IsItPalindromeTest {

    @ParameterizedTest
    @CsvSource({
            "1, true",
            "112, false",
            "121, true",
            "1551, true",
            "999990, false",
    })
    void checkIntegers(int number, boolean expectedResult) {
        assertEquals(expectedResult, IsItPalindrome.check(number));
    }

    @ParameterizedTest
    @CsvSource({
            "'Goog', true",
            "'Google', false",
            "'Hah', true",
            "'Aviva', true",
            "Bob, true",
    })
    void checkStrings(String word, boolean expectedResult) {
        assertEquals(expectedResult, IsItPalindrome.check(word));
    }

}