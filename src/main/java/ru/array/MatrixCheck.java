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

    public static boolean monoVertical(char[][] board, int column) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] arrray = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = new char[arrray.length];
        for (int index = 0; index < arrray.length; index++) {
            result[index] = arrray[index][index];
        }
        System.out.println(result);
    }

}

