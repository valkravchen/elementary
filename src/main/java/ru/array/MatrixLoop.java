package ru.array;

public class MatrixLoop {
    public static void main(String[] args) {
        int[][] array = {{4, 2, 3}, {7, 1}, {3, 5, 6, 4}};
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                int value = array[row][column];
                System.out.println(value);
            }
        }
    }
}
