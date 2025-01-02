package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int remainingChange = money - price;
        int size = 0;
        for (int coin : coins) {
            while (remainingChange >= coin) {
                result[size] = coin;
                remainingChange -= coin;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
