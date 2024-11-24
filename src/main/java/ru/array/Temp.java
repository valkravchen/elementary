package ru.array;

import java.util.Arrays;

public class Temp {
    public static int[] temp(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int[] temp = new int[array.length]; // Инициализация внутри цикла
            temp[index] = array[array.length - 1 - index];
            result = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(temp(array)));
    }
}
