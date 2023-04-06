package com.isvaso;

/**
 * Написать программу на Java для вычисления серии чисел Фибоначчи
 */
public class FibonacciSeriesGenerator {

    public static String generate(int num) {
        if (num == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder(100);

        long a = 0;
        long b = 0;
        long c = 1;

        while (num-- > 0) {
            a = b;
            b = c;
            c = a + b;
            sb.append(a);

            if (num > 0) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
