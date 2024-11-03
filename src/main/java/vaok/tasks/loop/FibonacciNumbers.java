package vaok.tasks.loop;

public class FibonacciNumbers {
    public static void printFibonacciUpTo(int number) {
        int previous = 0;
        int current = 1;

        System.out.println(previous);
        while (current <= number) {
            System.out.println(current);
            int next = previous + current;
            previous = current;
            current = next;
        }
    }

    public static void main(String[] args) {
        printFibonacciUpTo(20);
    }
}



