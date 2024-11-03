package vaok.tasks.loop;

public class SumNumbers {
    public static void sumUpTo(int number) {
        int sum = 0;
        int counter = 1;

        // Цикл while для суммирования чисел
        while (counter <= number) {
            sum += counter;
            counter++;
        }

        System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
    }

    public static void main(String[] args) {
        sumUpTo(100); // Выводим сумму чисел от 1 до 100
    }
}