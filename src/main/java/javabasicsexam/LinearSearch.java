package javabasicsexam;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30; // Искомый элемент.
        int index = -1;  // Индекс искомого элемента (по умолчанию -1, если элемент не найден).

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i; // Нашли элемент.
                break; // Выходим из цикла.
            }
        }

        if (index != -1) {
            System.out.println("Элемент найден на позиции: " + index);
        } else {
            System.out.println("Элемент не найден.");
        }
    }
}
