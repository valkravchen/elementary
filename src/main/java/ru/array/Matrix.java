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

    public static void main(String[] args) {
        int size = 9;
        int[][] array = Matrix.multiple(size);
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.println(array[row][column]);
            }
        }
    }
}
