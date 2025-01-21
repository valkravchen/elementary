package javabasicsexam;

public class LinearSearchDoWhile {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int index = -1;
        int i = 0;

        do {
            if (numbers[i] == target) {
                index = i;
                break;
            }
            i++;
        } while (i < numbers.length);

        if (index != -1) {
            System.out.println("Элемент найден на позиции: " + index);
        } else {
            System.out.println("Элемент не найден.");
        }
    }
}
