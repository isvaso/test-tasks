package com.isvaso;

import java.util.HashMap;
import java.util.Map;

/**
 * Напишите программу на Java для подсчета количества конкретных слов в строке,
 * используя HashMap
 */
public class WordsCounterWithHashMap {

    public static Map<String, Integer> count(String text) {
        Map<String, Integer> counter = new HashMap<>();

        text = text.trim();

        if (text.equals("")) {
            return counter;
        }

        String[] words = text.split(" ");

        System.out.println(words);

        for (String s : words) {
            if (counter.containsKey(s)) {
                int count = counter.get(s);
                counter.put(s, ++count);
            } else {
                counter.put(s, 1);
            }
        }

        return counter;
    }
}
