package ru.array;

public class Matrix {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int value;
        for (int row = 1; row < array.length; row++) {
            for (int column = 1; column < array[row].length; column++) {
                value = row * column;
                System.out.println(value);
            }
        }
    }
}
