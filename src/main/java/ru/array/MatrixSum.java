package ru.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                result += array[row][cell];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{8}, {6, 5, 5}, {93, 3}};
        System.out.println(sum(array));
    }
}
