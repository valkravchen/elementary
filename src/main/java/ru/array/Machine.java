package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int x = money - price;
        int[] result = new int[100];
        int size = 0;
        while (x != 0) {
            result[size] = coins[size];
            x -= coins[size];
            size++;
        }
        return Arrays.copyOf(result, size);
    }

    public static void main(String[] args) {
        int money = 50;
        int price = 35;
        int[] result = Machine.change(money, price);
        for (int element : result) {
            System.out.println(element);
        }
    }
}

