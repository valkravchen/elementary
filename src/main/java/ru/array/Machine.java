package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int change = money - price;
        int i = 0;
        int size = 0;
        while (change > 0) {
            if (change < coins[i]) {
                i++;
            } else {
                result[size] = coins[i];
                change -= coins[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
