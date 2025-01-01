package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = -2;
        int[] result = TwoNumberSum.getIndexes(array, target);
        for (int element : result) {
            System.out.println(element);
        }
    }
}








