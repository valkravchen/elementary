package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int right = array.length - 1;
        while (i < right) {
            int sum = array[i] + array[right];
            if (sum == target) {
                return new int[]{i, right};
            } else if (sum > target) {
                right--;
            } else {
                i++;
            }
        }
        return new int[0];
    }
}










