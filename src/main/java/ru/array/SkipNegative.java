package ru.array;

public class SkipNegative {
    public static void main(String[] args) {
        int[][] array = {{-33}, {23, 8, -55}, {2, 3, -77, -88}, {0}};
        SkipNegative.skip(array);
    }

    public static void skip(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                if (value < 0) {
                    value = 0;
                }
                System.out.println(value);
            }
        }
    }
}


