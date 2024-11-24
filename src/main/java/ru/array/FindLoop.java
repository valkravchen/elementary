package ru.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {3, 7, 5, 25, 10, 2, 6};
        int element = 5;
        int start = 0;
        int finish = 3;
        System.out.println(indexInRange(data, element, start, finish));
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        for (int index = start; index <= finish; index++) {
            if (element == data[index]) {
                return index;
            }
        }
        return -1;
    }
}