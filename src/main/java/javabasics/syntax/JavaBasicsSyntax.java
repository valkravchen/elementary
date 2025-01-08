package javabasics.syntax;

public class JavaBasicsSyntax {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int number = 5;
        iterateArray(array);
        int element = findElement(array, number);
        System.out.println(element);
    }

    public static void iterateArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static int findElement(int[] array, int target) {
        for (int element : array) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}


