package com.isvaso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for WhileAndForArrayListIteration")
class WhileAndForArrayListIterationTest {

    private WhileAndForArrayListIteration instance;

    @BeforeEach
    void setUp() throws Exception {
        instance = new WhileAndForArrayListIteration();
    }
    @ParameterizedTest
    @NullAndEmptySource
    void whileIterationWithNullOrEmptyListTest(List<Object> list) {
        assertDoesNotThrow(() -> instance.whileIteration(new ArrayList<>()));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    void whileIterationWithNonEmptyListTest(String input) {
        List<String> list = Arrays.asList(input.split(""));
        assertDoesNotThrow(() -> instance.whileIteration(new ArrayList<>(list)));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("Test forIteration() with null or empty list")
    void testForIterationWithNullOrEmptyList(List<Object> list) {
        assertDoesNotThrow(() -> instance.forIteration(new ArrayList<>()));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    void testForIterationWithNonEmptyList(String input) {
        List<String> list = Arrays.asList(input.split(""));
        assertDoesNotThrow(() -> instance.forIteration(new ArrayList<>(list)));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testForEachIterationWithNullOrEmptyList(List<Object> list) {
        assertDoesNotThrow(() -> instance.forEachIteration(new ArrayList<>()));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    void testForEachIterationWithNonEmptyList(String input) {
        List<String> list = Arrays.asList(input.split(""));
        assertDoesNotThrow(() -> instance.forEachIteration(new ArrayList<>(list)));
    }

}