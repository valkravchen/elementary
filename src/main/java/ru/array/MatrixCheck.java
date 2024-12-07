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
        for (char[] row : board) {
            if (row[column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'1', ' ', ' '},
                {' ', '3', ' '},
                {' ', ' ', '1'},
        };
     char[] result = extractDiagonal(board);
        for (char element : result) {
            System.out.println(element);
        }
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            result[index] = board[index][index];
        }
        return result;
    }
}


