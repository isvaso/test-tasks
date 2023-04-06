package com.isvaso;

/**
 * Напишите программу на Java
 * для переворота последовательности символов в строке
 * без использования встроенной в String функции reverse()
 * и получения результата в виде массива символов
 */
public class StringToReversedCharArray {

    public static char[] reverseToChar(String string) {
        char[] charsSource = string.toCharArray();
        char[] charsReversed = new char[charsSource.length];

        int j = 0;

        for (int i = charsSource.length - 1; i >= 0; i--) {
            charsReversed[j++] = charsSource[i];
        }

        return charsReversed;
    }
}
