package ru.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int[] row : array) {
            for (int value : row) {
                result += value;
            }
        }
        return result;
    }
}
