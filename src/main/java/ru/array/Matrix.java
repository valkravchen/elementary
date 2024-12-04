package ru.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 1; row <= table.length; row++) {
            for (int column = 1; column <= table.length; column++) {
                table[row - 1][column - 1] = row * column;
            }
        }
        return table;
    }
}
