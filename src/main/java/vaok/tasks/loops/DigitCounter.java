package vaok.tasks.loops;

public class DigitCounter {
    public static int countDigits(int number) {
        number = Math.abs(number);
        int count = 0;

        if (number == 0) {
            return 1;
        }

        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(0));
        System.out.println(countDigits(3333));
        System.out.println(countDigits(-56789));
    }
}


