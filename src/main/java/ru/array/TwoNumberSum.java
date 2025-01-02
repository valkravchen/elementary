package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = i + 1;
        while (i < array.length - 1) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            } else if (j < array.length - 1) {
                j++;
            } else {
                i++;
                j = i + 1;
            }
        }
        return new int[0];
    }
}









