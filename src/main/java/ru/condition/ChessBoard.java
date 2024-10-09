package ru.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        if (isValid(x1) && isValid(x2) && isValid(y1) && isValid(y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                return Math.abs(x2 - x1);
            }
        }
        return 0;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        int result = way(1, 1, 5, 5);
        System.out.println("Количество шагов для хода слона: " + result);
    }
}
