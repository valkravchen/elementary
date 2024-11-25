package ru.array;

public class Min {
    public static void main(String[] args) {
        int[] array = new int[]{11, 3, 5, 333, 1};
        int min = array[0];
        for (int number : array) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println(min);
    }
}