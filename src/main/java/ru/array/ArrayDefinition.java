package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index;
            System.out.println(numbers[index]);
        }
    }
}

