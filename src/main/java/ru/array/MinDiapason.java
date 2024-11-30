package ru.array;

public class MinDiapason {
    public static int findMinElement(int[] array, int start, int finish) {
        int minElement = array[start];
        for (int index = start + 1; index <= finish; index++) {
            if (minElement > array[index]) {
                minElement = array[index];
            }
        }
        return minElement;
    }

    public static int findMinElementIndex(int[] array, int start, int finish) {
        int minElement = array[start];
        int minElementIndex = start;
        for (int index = start + 1; index <= finish; index++) {
            if (minElement > array[index]) {
                minElement = array[index];
                minElementIndex = index;
            }
        }
        return minElementIndex;
    }
}

