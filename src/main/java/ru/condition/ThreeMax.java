package ru.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= first && second >= third) {
            result = second;
        }
        if (third > first && third > second) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int first = 1;
        int second = 100;
        int third = 100;
        System.out.println(max(first, second, third));
    }
}
