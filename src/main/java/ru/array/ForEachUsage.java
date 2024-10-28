package ru.array;

public class ForEachUsage {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five"};
        int index = 0;
        for (String number : numbers) {
            System.out.println("Индекс " + index + ": " + number);
            index++;
        }
    }
}