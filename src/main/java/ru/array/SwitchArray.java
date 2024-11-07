package ru.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int destination) {
        int temp = array[destination];
        array[destination] = array[source];
        array[source] = temp;
        return array;
    }
}



