package ru.array;

public class Check {
    public static void main(String[] args) {
        boolean[] data = new boolean[]{false, false, false};
        boolean result = true;
        boolean first = data[0];
        for (boolean value: data) {
            if (value != first) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
