package javabasics.syntax;

public class DecisionMaking {
    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Число " + number + " - чётное.");
        } else {
            System.out.println("Число " + number + " - нечётное.");
        }
    }

    public static void printMonthName(byte month) {
        switch (month) {
            case 1:
                System.out.println("Январь.");
                break;
            case 2:
                System.out.println("Февраль.");

            case 3:
                System.out.println("Март.");
                break;
            case 4:
                System.out.println("Апрель.");
                break;
            case 5:
                System.out.println("Май.");
                break;
            case 6:
                System.out.println("Июнь.");
                break;
            case 7:
                System.out.println("Июль.");
                break;
            case 8:
                System.out.println("Август.");
                break;
            case 9:
                System.out.println("Сентябрь.");
                break;
            case 10:
                System.out.println("Октябрь.");
                break;
            case 11:
                System.out.println("Ноябрь.");
                break;
            case 12:
                System.out.println("Декабрь.");
                break;
            default:
                System.out.println("Значение некорретное.");
        }
    }

    public static void checkAge(byte age) {
        String result = (age >= 18) ? "Совершеннолетие." : "Несовершеннолетие.";
        System.out.println(result);
    }

    public static void main(String[] args) {
        int number = 3;
        byte smallNumber = 2;
        checkEvenOrOdd(number);
        printMonthName(smallNumber);
        checkAge(smallNumber);
    }
}

