package javabasics.syntax;

public class TernaryPractice {

    public static void checkNumberSign(int number) {
        String result = (number > 0) ? "Число положительное." :
                (number < 0) ? "Число отрицательное." : "Число равно нулю.";
        System.out.println(result);
    }

    public static void checkEvenOdd(int number) {
        String result = (number % 2 == 0) ? "Число чётное." : "Число нечётное.";
        System.out.println(result);
    }

    public static void checkStringLength(String input) {
        String result = (input.length() >= 5) ? "Длина строки больше или равна 5 символам." : "Длина строки меньше 5 символов.";
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkNumberSign(0);
        checkEvenOdd(0);
        checkStringLength("Код на Java.");
    }
}