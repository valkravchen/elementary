package ru.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int index = 1; index <= n; index++) {
            result *= index;
        }
        return result;
    }
}