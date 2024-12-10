package ru.array;

public class MatrixCheck {
    public static void main(String[] args) {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = true;
        for (int column = 0; column < input[row].length; column++) {
            if (input[row][column] != 'X') {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}

