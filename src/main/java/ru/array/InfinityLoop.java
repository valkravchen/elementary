package ru.array;

public class InfinityLoop {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.println("infinity");
            // Это выражение вызывает вечный цикл, так как "отменяет" увеличение index++ на каждой итерации.
            index = index - 1;
        }
    }
}

