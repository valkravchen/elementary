package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] numbers = new int[bound];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * i;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
