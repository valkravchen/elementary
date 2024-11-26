package ru.array;

public class MinDiapason {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int min = array[start];
        for (int index = start + 1; index <= finish; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        System.out.println(min);
    }
}
