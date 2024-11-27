package ru.array;

public class SortSelected {
    public static void main(String[] args) {
        int[] array = new int[] {3, 5, 1, 2, 4, 0};
        int start = 0;
        int finish = 5;
        int minElement = MinDiapason.findMin(array, start, finish);
        int minElementIndex = FindLoop.indexInRange(array, minElement, start, finish);
        SwitchArray.swap(array, start, minElementIndex);
        start = 1;
        minElement = MinDiapason.findMin(array, start, finish);
        minElementIndex = FindLoop.indexInRange(array, minElement, start, finish);
        SwitchArray.swap(array, start, minElementIndex);
        start = 2;
        minElement = MinDiapason.findMin(array, start, finish);
        minElementIndex = FindLoop.indexInRange(array, minElement, start, finish);
        SwitchArray.swap(array, start, minElementIndex);
        start = 3;
        minElement = MinDiapason.findMin(array, start, finish);
        minElementIndex = FindLoop.indexInRange(array, minElement, start, finish);
        SwitchArray.swap(array, start, minElementIndex);
        start = 4;
        minElement = MinDiapason.findMin(array, start, finish);
        minElementIndex = FindLoop.indexInRange(array, minElement, start, finish);
        SwitchArray.swap(array, start, minElementIndex);
        for (int element : array) {
            System.out.println(element);
        }
    }
}

