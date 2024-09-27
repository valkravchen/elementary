package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtract(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма сложения двух чисел и умножения двух чисел равна: " + sumAndMultiply(10, 20));
        System.out.println("Сумма вычитания двух чисел и деления двух чисел равна: " + subtractAndDivide(33, 11));
        System.out.println("Cумма вычисления всех операций равна: " + sumOfAllOperations(33, 11));
    }
}


