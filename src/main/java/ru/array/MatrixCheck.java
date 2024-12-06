package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        int result = 0;
        for (int column = 0; column < board[row].length; column++) {
            if (board[row][column] == 'X') {
                result += 1;
            }
        }
        return result == board[row].length;
    }
}

