package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int lef = 0;
        int right = array.length - 1;
        while (lef < right) {
            int sum = array[lef] + array[right];
            if (sum == target) {
                return new int[]{lef, right};
            } else if (sum > target) {
                right--;
            } else {
                lef++;
            }
        }
        return new int[0];
    }
}










