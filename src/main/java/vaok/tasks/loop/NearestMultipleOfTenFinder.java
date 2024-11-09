package vaok.tasks.loop;

public class NearestMultipleOfTenFinder {
    public static int findNearestMultipleOfTen(int number) {
        int lowerMultiple = (number / 10) * 10;
        int upperMultiple = lowerMultiple + 10;

        if (number - lowerMultiple < upperMultiple - number) {
            return lowerMultiple;
        } else {
            return upperMultiple;
        }
    }

    public static void main(String[] args) {
        System.out.println(findNearestMultipleOfTen(23)); // Ожидаемый результат: 20
        System.out.println(findNearestMultipleOfTen(27)); // Ожидаемый результат: 30
    }
}
