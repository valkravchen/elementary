package ru.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                table[row][column] = (row + 1) * (column + 1);
            }
        }
        return table;
    }
}
