package ru.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int destination) {
        int temp = array[destination];
        array[destination] = array[source];
        array[source] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
}



