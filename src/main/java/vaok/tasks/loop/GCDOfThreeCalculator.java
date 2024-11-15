package vaok.tasks.loop;

public class GCDOfThreeCalculator {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findGCD(int a, int b, int c) {
        int gcdOfTwo = findGCD(a, b);
        return findGCD(gcdOfTwo, c);
    }

    public static void main(String[] args) {
        System.out.println(findGCD(18, 27, 45)); // Ожидаемый результат: 9
        System.out.println(findGCD(8, 12, 16));  // Ожидаемый результат: 4
    }
}
