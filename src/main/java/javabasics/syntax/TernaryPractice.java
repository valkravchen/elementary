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
        String result = (input.length() > 5) ? "Длина строки больше 5 символов." : "Длина строки меньше или равна 5 символам.";
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkNumberSign(0);
        checkEvenOdd(0);
        checkStringLength("Код.");
    }
}