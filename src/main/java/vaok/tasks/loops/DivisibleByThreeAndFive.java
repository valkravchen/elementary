package vaok.tasks.loops;

public class DivisibleByThreeAndFive {
    public static void printDivisibleByThreeAndFive(int number) {
        for (int index = 15; index <= number; index += 15) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        printDivisibleByThreeAndFive(103);

    }
}

