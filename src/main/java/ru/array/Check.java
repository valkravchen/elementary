package ru.array;

public class Check {
    public static void main(String[] args) {
        boolean result = true;
        boolean[] data = new boolean[]{false, false, false};
        for (int index = 1; index < data.length; index++) {
            if (data[0] != data[index]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
