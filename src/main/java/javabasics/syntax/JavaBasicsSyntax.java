package javabasics.syntax;

public class JavaBasicsSyntax {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        iterateArray(array);
    }

    public static void iterateArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}


