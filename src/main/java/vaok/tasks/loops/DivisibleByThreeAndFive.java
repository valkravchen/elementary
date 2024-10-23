package vaok.tasks.loops;

public class DivisibleByThreeAndFive {
    public static void printDivisibleByThreeAndFive(int number) {
        for (int index = 1; index <= number; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                System.out.println(index);
            }
        }
    }

    public static void main(String[] args) {
        printDivisibleByThreeAndFive(103);

    }
}

