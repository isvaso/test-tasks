package com.isvaso;

import java.util.Iterator;
import java.util.Map;

/**
 * Напишите Java-программу для итерации объекта типа HashMap
 * с использованием цикла while и улучшенного цикла for
 */
public class WhileAndForHashMapIteration {

    public static <T, R> void whileIteration(Map<T, R> sourceMap) {
        Iterator<Map.Entry<T, R>> iterator = sourceMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<T, R> keyValue = iterator.next();
            System.out.println(keyValue.getKey() + ": " + keyValue.getValue());
        }
    }

    public static <T, R> void forIteration(Map<T, R> sourceMap) {
        for (Map.Entry<T, R> keyValue : sourceMap.entrySet()) {
            System.out.println(keyValue.getKey() + ": " + keyValue.getValue());
        }
    }
}
