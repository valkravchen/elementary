package ru.array;

public class SortSelected {
    public static void main(String[] args) {
        int[] array = new int[] {3, 5, 1, 2, 4};
        int start = 0;
        int finish = 4;
        int minElement = MinDiapason.findMin(array, start, finish);
        System.out.println(minElement);
    }
}
