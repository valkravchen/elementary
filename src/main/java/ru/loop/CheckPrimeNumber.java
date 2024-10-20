package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isPrime = number >= 2;
        for (int index = 2; index <= number / 2; index++) {
            if (number % index == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}


