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

    public static void main(String[] args) {
        char[][] array = {
                {'1', '2', '3', '4', 'X'},
                {'5', '6', '7', '8', 'X'},
                {'9', '1', '2', '3', 'X'},
                {'4', '5', '6', '7', 'X'},
                {'8', '9', '1', '2', 'X'},
        };
        boolean result = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index][index] == 'X') {
                result = monoHorizontal(array, index) || monoVertical(array, index);
                break;
            }
        }
        System.out.println(result);
    }
}


