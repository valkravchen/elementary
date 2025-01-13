package javabasics.syntax;

public class JavaBasicsSyntax {
    public static void iterateArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
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

    public static int[] removeElement(int[] array, int delElement) {
        int[] newArray = new int[array.length - 1];
        for (int index = 0; index < array.length; index++) {
            if (array[index] != delElement) {
                newArray[index] = array[index];
            }
        }
        return newArray;
    }
}



