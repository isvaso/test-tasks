package com.isvaso;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for WhileAndForHashMapIterationTest")
class WhileAndForHashMapIterationTest {

    @ParameterizedTest
    @MethodSource("provideMaps")
    void whileIteration(Map<?, ?> sourceMap) {
        StringBuilder expected = new StringBuilder();
        Iterator<?> iterator = sourceMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<?, ?> keyValue = (Map.Entry<?, ?>) iterator.next();
            expected.append(keyValue.getKey())
                    .append(": ")
                    .append(keyValue.getValue())
                    .append("\n");
        }

        StringBuilder actual = new StringBuilder();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        WhileAndForHashMapIteration.whileIteration(sourceMap);

        actual.append(baos);

        assertEquals(expected.toString(), actual.toString());
    }

    @ParameterizedTest
    @MethodSource("provideMaps")
    void forIteration(Map<?, ?> sourceMap) {
        StringBuilder expected = new StringBuilder();

        for (Map.Entry<?, ?> keyValue : sourceMap.entrySet()) {
            expected.append(keyValue.getKey()).append(": ").append(keyValue.getValue()).append("\n");
        }

        StringBuilder actual = new StringBuilder();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        WhileAndForHashMapIteration.forIteration(sourceMap);

        actual.append(baos);

        assertEquals(expected.toString(), actual.toString());
    }

    private static Stream<Map<?, ?>> provideMaps() {

        return new HashMapProvider().provideArguments(null)
                .map(args -> (Map<?, ?>) args.get()[0]);
    }

    public static class HashMapProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            Map<String, Integer> map1 = new HashMap<>();
            map1.put("hello", 1);
            map1.put("world", 2);

            Map<Integer, String> map2 = new HashMap<>();
            map2.put(1, "hello");
            map2.put(2, "world");

            return Stream.of(
                    Arguments.of(map1),
                    Arguments.of(map2)
            );
        }
    }
}