package ru.loop;

public class Slash {
    public static void main(String[] args) {
        int size = 5;
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                if (row == cell) {
                    if (cell == 0) {
                        System.out.println(cell);
                    } else if (row > 0) {
                        System.out.println(" " + cell);
                    }
                }
            }
        }
    }
}

