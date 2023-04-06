package com.isvaso;

/**
 * Напишите программу на Java, чтобы поменять местами значения,
 * хранящиеся в двух переменных, без использования третьей переменной
 */
public class SwapVariablesInTwoWithoutThird {

    private int a;
    private int b;

    public SwapVariablesInTwoWithoutThird(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void swapWithoutThird() {
        a = b + a;
        b = a - b;
        a = a - b;
    }
}
