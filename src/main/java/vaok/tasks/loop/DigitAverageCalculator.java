package vaok.tasks.loop;

public class DigitAverageCalculator {
    public static double calculateDigitAverage(int number) {
        number = Math.abs(number);
        int sum = 0;
        int count = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
            count++;
        }

        return count == 0 ? 0 : (double) sum / count;
    }

    public static void main(String[] args) {
        System.out.println(calculateDigitAverage(12345));
        System.out.println(calculateDigitAverage(111));
    }
}

