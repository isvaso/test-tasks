package com.isvaso;

/**
 * Напишите программу на Java, чтобы узнать, является ли число простым или нет
 */
public class IsTheNumberPrime {

    public static boolean check(int number) {
        for (int i = 2; i <= number / 2; i++) {
            int temp = number % i;

            if (temp == 0) {
                return false;
            }
        }

        return true;
    }
}
