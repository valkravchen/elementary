package vaok.tasks.loops;

public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));   // Ожидаемый результат: true
        System.out.println(isPalindrome(12321)); // Ожидаемый результат: true
        System.out.println(isPalindrome(12345)); // Ожидаемый результат: false
    }
}

