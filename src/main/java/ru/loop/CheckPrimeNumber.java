package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        for (int index = 2; index <= number / 2; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }
}

