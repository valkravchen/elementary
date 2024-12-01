package ru.array;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] array = {{8}, {6, 5, 5}, {93, 3}};
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                sum += array[row][cell];
            }
        }
        System.out.println(sum);
    }
}
