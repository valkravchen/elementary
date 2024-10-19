package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int result = 0;
        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                result++;
            }
            if (result > 2) {
                break;
            }
        }
        return result == 2;
    }
}

