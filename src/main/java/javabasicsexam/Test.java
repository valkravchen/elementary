package javabasicsexam;

public class Test {
    public static void main(String[] args) {
        // Символы Unicode
        char letterA = 'A';          // Латинская буква A
        char digit1 = '1';           // Цифра 1
        char smiley = '\u1F60';     // Смайлик 😊
        char hanChar = '\u6F22';     // Китайский иероглиф 漢

        // Вывод символов
        System.out.println("Латинская буква: " + letterA);
        System.out.println("Цифра: " + digit1);
        System.out.println("Иероглиф: " + hanChar);
        System.out.println(smiley);
    }
}
