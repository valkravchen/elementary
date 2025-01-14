package javabasics.syntax;

public class JavaBasicsSyntax {
    public static void showPrimitiveTypes() {
        byte byteNumber = 3; // 1 байт (8 бит)
        short shortNumber = 3; // 2 байта (16 бит)
        int intNumber = 3; // 4 байта (32 бита)
        long longNumber =  2147483648L; // 8 байт (64 бита)
        float floatNumber = 3.33f; // 4 байта (32 бита)
        double doubleNumber = 3.33; // 8 байт (64 бита)
        char charSymbol = '3'; // 2 байта (16 бит)
        boolean iLoveJava = true;

        System.out.println("byte: " + byteNumber);
        System.out.println("short: " + shortNumber);
        System.out.println("int: " + intNumber);
        System.out.println("long : " + longNumber);
        System.out.println("float : "  + floatNumber);
        System.out.println("double : " + doubleNumber);
        System.out.println("char : "  + charSymbol);
        System.out.println("bbolean : "  + iLoveJava);
    }

    public static void main(String[] args) {
        showPrimitiveTypes();
    }
}



