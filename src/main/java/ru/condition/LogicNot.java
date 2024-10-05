package ru.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int num = -3;
        System.out.println("Число " + num + " чётное? " + isEven(num));
        System.out.println("Число " + num +  " положительное? " + isPositive(num));
        System.out.println("Число " + num + " нечётное? " + notEven(num));
        System.out.println("Число " + num + " не положительное? " + notPositive(num));
        System.out.println("Число " + num  + " нечётное и положительное? " + notEvenAndPositive(num));
        System.out.println("Число " + num + " чётное или не положительное? " + evenOrNotPositive(num));
    }
}
