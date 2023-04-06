package com.isvaso;

/**
 * Напишите программу на Java для того, чтобы поменять местами значения,
 * хранящиеся в двух переменных с помощью третьей переменной
 */
public class SwapVariablesInTwoWithThird {

    private int a;
    private int b;

    public SwapVariablesInTwoWithThird(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void swapWithThird() {
        int temp = a;

        a = b;
        b = temp;
    }
}
