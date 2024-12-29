package ru.array;

public class Compress {
    public static int[] compress(int[] array) {
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (array[i] == 0 && array[j] != 0) {
                array[i] = array[j];
                array[j] = 0;
            }
            if (array[i] != 0) {
                i++;
            }
            j++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] startArray = {0, 1, 0, 0, 2, 0, 3, 0, 0, 4, 5, 6, 0, 7};
        int[] finishArray = Compress.compress(startArray);
        for (int index = 0; index < finishArray.length; index++) {
            System.out.println(finishArray[index]);
        }
    }
}
