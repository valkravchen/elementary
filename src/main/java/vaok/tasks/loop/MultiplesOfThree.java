package vaok.tasks.loop;

public class MultiplesOfThree {
    public static void printMultiplesOfThree(int number) {
        for (int index = 3; index <= number; index += 3) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        printMultiplesOfThree(333);
    }
}
