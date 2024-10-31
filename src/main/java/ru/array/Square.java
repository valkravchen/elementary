package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] numbers = new int[bound];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * index;
        }
        return numbers;
    }
}
