package ru.array;

public class Compress {
    public static int[] compress(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == 0) {
                for (int j = index + 1; j < array.length; j++) {
                    if (array[j] != 0) {
                        array[index] = array[j];
                        array[j] = 0;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
