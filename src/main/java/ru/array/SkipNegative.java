package ru.array;

public class SkipNegative {
    public static void main(String[] args) {
        int[][] array = {{-33}, {23, 8, -55}, {2, 3, -77, -88}, {0}};
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        for (int[] row : array) {
            for (int value : row) {
                System.out.println(value);
            }
        }
    }
}


