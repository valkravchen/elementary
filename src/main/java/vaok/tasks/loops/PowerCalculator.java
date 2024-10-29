package vaok.tasks.loops;

public class PowerCalculator {
    public static int calculatePower(int base, int exponent) {
        if (base == 0 && exponent == 0) {
            return 1; // 0^0 = 1 по соглашению
        } else if (base == 0) {
            return 0;
        }

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculatePower(2, 3));
        System.out.println(calculatePower(0, 2));
        System.out.println(calculatePower(0, 0));
    }
}


