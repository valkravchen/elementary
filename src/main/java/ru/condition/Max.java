package ru.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static void main(String[] args) {
        int result = Max.max(2, 1);
        System.out.println(result);
    }
}

