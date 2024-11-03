package vaok.tasks.loop;

public class ReverseEvenNumbers {
    public static void printEvenNumbersReverse(int number) {
        // Цикл от заданного числа до 1 с шагом -1
        for (int index = number; index >= 1; index--) {
            // Проверка на чётность
            if (index % 2 == 0) {
                System.out.println(index);
            }
        }
    }

    public static void main(String[] args) {
        printEvenNumbersReverse(100); // Выводим чётные числа от 100 до 1
    }
}