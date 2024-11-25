package ru.array;

public class Min {
    public static void main(String[] args) {
        int[] array = new int[]{11, 3, 5, 333, 1};
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        System.out.println(min);
    }
}