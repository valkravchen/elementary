package javabasicsexam;

public class UnicodeExample {
    public static void main(String[] args) {
        char letterA = 'A';          // Латинская буква A
        char digit1 = '1';           // Цифра 1
        char hanChar = '\u6F22';     // Китайский иероглиф 漢

        System.out.println("Латинская буква: " + letterA);
        System.out.println("Цифра: " + digit1);
        System.out.println("Иероглиф: " + hanChar);
    }
}
