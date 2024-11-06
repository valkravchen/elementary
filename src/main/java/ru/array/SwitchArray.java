package ru.array;

public class SwitchArray {

    public static void swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        swapBorder(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}