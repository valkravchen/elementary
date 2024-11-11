package vaok.tasks.loop;

public class BinaryPalindromeChecker {
    public static boolean isBinaryPalindrome(int number) {
        String binaryString = Integer.toBinaryString(number);
        int left = 0;
        int right = binaryString.length() - 1;

        while (left < right) {
            if (binaryString.charAt(left) != binaryString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBinaryPalindrome(9));  // Ожидаемый результат: true
        System.out.println(isBinaryPalindrome(10)); // Ожидаемый результат: false
    }
}
