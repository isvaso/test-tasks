package com.isvaso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("Tests for WordsCounterWithHashMapTest")
class WordsCounterWithHashMapTest {

    @ParameterizedTest
    @MethodSource("stringProducer")
    void count(String text, Map<String, Integer> expectedResults) {
        Map<String, Integer> sourceMap = WordsCounterWithHashMap.count(text);

        expectedResults.forEach((word, count) ->
                assertEquals(count, sourceMap.get(word)));
    }

    static Stream<Arguments> stringProducer() {
        return Stream.of(
                arguments(
                        "Text of text",
                        Map.of(
                                "Text", 1,
                                "of", 1,
                                "text", 1
                        )),
                arguments(
                        "          ",
                        Map.of()),
                arguments(
                        " Text when need trim and when     spaces are big   ",
                        Map.of(
                                "Text", 1,
                                "when", 2,
                                "need", 1,
                                "trim", 1,
                                "and", 1,
                                "spaces", 1,
                                "are", 1,
                                "big", 1
                        ))
        );
    }
}