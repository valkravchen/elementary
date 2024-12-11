package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int column = 0; column < board[row].length; column++) {
            if (board[row][column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] array = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = true;
        for (int row = 0; row < array.length; row++) {
            if (array[row][column] != 'X') {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}

