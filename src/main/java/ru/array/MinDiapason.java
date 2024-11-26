package ru.array;

public class MinDiapason {
    public static void main(String[] args) {
        int[] array = new int[]{10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        System.out.println(findMin(array, start, finish));
    }

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start + 1; index <= finish; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}

