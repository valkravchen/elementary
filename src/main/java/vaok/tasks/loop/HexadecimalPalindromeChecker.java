package vaok.tasks.loop;

public class HexadecimalPalindromeChecker {
    public static boolean isHexPalindrome(int number) {
        String base6String = Integer.toString(number, 6);
        int left = 0, right = base6String.length() - 1;

        while (left < right) {
            if (base6String.charAt(left) != base6String.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHexPalindrome(121));  // Ожидаемый результат: true
        System.out.println(isHexPalindrome(123));  // Ожидаемый результат: false
    }
}
