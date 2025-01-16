package javabasics.syntax;

public class LogicalOperatorsPractice {
    public static void checkRange(int number) {
        if (number >= 10 && number <= 20) {
            System.out.println("Число находится в диапазоне.");
        } else {
            System.out.println("Число находится вне диапазона.");
        }
    }

    public static void checkPositive(int number1, int number2) {
        if (number1 > 0 || number2 >= 0) {
            System.out.println("Хотя бы одно число положительное.");
        } else {
            System.out.println("Оба числа отрицательные.");
        }
    }

    public static void checkComplexCondition(int number1, int number2, int number3) {
        if ((number1 % 2 == 0 && number2 > 0) || number3 < 0) {
            System.out.println("Условие выполнено.");
        } else {
            System.out.println("Условие не выполнено.");
        }
    }

    public static void main(String[] args) {
        checkRange(19);
        checkPositive(10, 33);
        checkComplexCondition(3, 33, 8);
    }
}

