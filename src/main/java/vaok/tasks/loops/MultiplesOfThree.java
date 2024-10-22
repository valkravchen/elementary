package vaok.tasks.loops;

public class MultiplesOfThree {
    public static void printMultiplesOfThree(int number) {
        for (int index = 1; index <= number; index++) {
            if (index % 3 == 0) {
                System.out.println(index);
            }
        }
    }

    public static void main(String[] args) {
        printMultiplesOfThree(333);
    }
}
