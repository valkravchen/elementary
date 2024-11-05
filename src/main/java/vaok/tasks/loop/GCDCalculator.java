package vaok.tasks.loop;

public class GCDCalculator {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(findGCD(48, 18)); // Ожидаемый результат: 6
        System.out.println(findGCD(54, 24)); // Ожидаемый результат: 6
    }
}

