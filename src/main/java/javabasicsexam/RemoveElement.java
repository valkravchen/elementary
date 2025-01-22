package javabasicsexam;

public class RemoveElement {
    public static int[] removeElementByIndex(int[] array, int indexOfRemovedElement) {
        int[] newArray = new int[array.length - 1];
        for (int index = 0, j = 0; index < array.length; index++) {
            if (index != indexOfRemovedElement) {
                newArray[j++] = array[index];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 40, 10, 50};

        // Удаление по индексу
        int[] newArray1 = removeElementByIndex(numbers, 2);
        System.out.println("Удаление по индексу 2:");
        for (int num : newArray1) {
            System.out.print(num + " ");
        }
    }
}