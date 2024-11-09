package vaok.tasks.loop;

public class SquareNumberChecker {
    public static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false; // Отрицательное число не может быть квадратом
        }
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(25)); // Ожидаемый результат: true
        System.out.println(isPerfectSquare(26)); // Ожидаемый результат: false
    }
}

