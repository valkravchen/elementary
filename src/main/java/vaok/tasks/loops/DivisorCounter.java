package vaok.tasks.loops;

public class DivisorCounter {
    public static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // проверяем, является ли i делителем
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDivisors(12)); // Ожидаемый результат: 6
    }
}

