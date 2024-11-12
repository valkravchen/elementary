package vaok.tasks.loop;

public class DoublePalindromeChecker {
    public static boolean isDoublePalindrome(int number) {
        int doubled = number * 2;
        return isPalindrome(doubled);
    }

    private static boolean isPalindrome(int number) {
        int reversed = 0;
        int original = number;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isDoublePalindrome(131));
        System.out.println(isDoublePalindrome(121));
    }
}
