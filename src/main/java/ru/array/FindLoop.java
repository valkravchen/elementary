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
        int element = 55;
        int start = 0;
        int finish = 3;
        for (int index = start; index <= finish; index++) {
            if (element == data[index]) {
                System.out.println(index);
                return;
            }
        }
        System.out.println("Элемента " + element + " нет в массиве data.");
    }
}