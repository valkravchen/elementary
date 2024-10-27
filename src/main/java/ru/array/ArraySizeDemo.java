package ru.array;

public class ArraySizeDemo {
    public static void main(String[] args) {
        int[] ints = new int[10];
        System.out.println("Размер массива равен: " + ints.length);
        System.out.println("Начальные значения массива:");
        for (int i = 0; i < ints.length; i++) {
            System.out.println("ints[" + i + "] = " + ints[i]);
        }
    }
}
