package vaok.tasks.loop;

public class LCMCalculator {
    public static int findLCM(int a, int b) {
        int max = Math.max(a, b);
        int lcm = max;

        while (lcm % a != 0 || lcm % b != 0) {
            lcm += max;
        }

        return lcm;
    }

    public static void main(String[] args) {
        System.out.println(findLCM(4, 6));
        System.out.println(findLCM(5, 7));
    }
}
