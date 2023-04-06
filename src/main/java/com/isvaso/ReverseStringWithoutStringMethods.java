package com.isvaso;

/**
 * Напишите программу на Java для переворачивания строки,
 * изменив расположение символов в строке задом наперёд
 * без использования встроенных в String функций.
 */
public class ReverseStringWithoutStringMethods {

    public static String reverse(String string) {
        StringBuilder sb = new StringBuilder(string);

        return sb.reverse().toString();
    }
}
