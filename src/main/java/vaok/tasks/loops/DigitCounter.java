package vaok.tasks.loops;

public class DigitCounter {
    public static void countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countDigits(3333);
    }
}
