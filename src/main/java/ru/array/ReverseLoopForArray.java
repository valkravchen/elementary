package ru.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Элементы массива в обратном порядке: ");
        for (int index = 0; index < numbers.length; index++) {
            int element = numbers[numbers.length - 1 - index];
            System.out.println(element);
        }
    }
}
