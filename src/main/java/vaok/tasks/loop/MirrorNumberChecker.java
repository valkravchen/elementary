package vaok.tasks.loop;

public class MirrorNumberChecker {
    public static boolean isMirrorNumber(int number) {
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
        System.out.println(isMirrorNumber(121));
        System.out.println(isMirrorNumber(123));
    }
}
