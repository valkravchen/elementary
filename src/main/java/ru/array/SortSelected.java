package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length - 1; index++) {
            int minElementIndex = MinDiapason.findMinElementIndex(data, index, data.length - 1);
            if (minElementIndex != index) {
                SwitchArray.swap(data, index, minElementIndex);
            }
        }
        return data;
    }
}



