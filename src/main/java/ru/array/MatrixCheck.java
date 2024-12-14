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

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            result[index] = board[index][index];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X') {
                result = monoHorizontal(board, index) || monoVertical(board, index);
            }
        }
        return result;
    }
}


