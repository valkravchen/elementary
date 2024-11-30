package ru.array;

public class SortSelected {
    public static void main(String[] args) {
        int[] array = new int[] {3, 5, 1, 2, 4};
        SortSelected.sort(array);
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length - 1; index++) {
            int minElementIndex = MinDiapason.findMinElementIndex(data, index, data.length - 1);
            if (minElementIndex == index) {
                continue;
            }
            SwitchArray.swap(data, index, minElementIndex);
        }
        return data;
    }
}



