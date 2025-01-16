package javabasics.syntax;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Число: " + numbers[i]);
        }

        int counter = 0;
        while (counter < 5) {
            counter++;
            System.out.println("Итерация " + counter);
        }

        do {
            System.out.println("Всегда выполняется.");
        } while (false);
    }
}