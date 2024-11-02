package vaok.tasks.loops;

public class LuckyTicketChecker {
    public static boolean isLuckyTicket(int number) {
        if (number < 100000 || number > 999999) {
            return false; // Число не является шестизначным
        }

        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0; i < 3; i++) {
            firstHalfSum += number % 10;
            number /= 10;
        }

        for (int i = 0; i < 3; i++) {
            secondHalfSum += number % 10;
            number /= 10;
        }

        return firstHalfSum == secondHalfSum;
    }

    public static void main(String[] args) {
        System.out.println(isLuckyTicket(123321)); // Ожидаемый результат: true
        System.out.println(isLuckyTicket(123456)); // Ожидаемый результат: false
    }
}
