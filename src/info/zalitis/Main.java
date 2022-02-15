package info.zalitis;

public class Main {

    public static void main(String[] args) {
        //we want to cast char to integer e.g. char letterA = A to int numversionOfLetterA;
        char  letterA = 'A';
        int letterAInNumericVersion = Character.getNumericValue(letterA);
        System.out.println("char letterA: " + letterA);
        System.out.println("int letterAInNumericVersion " + letterAInNumericVersion);
        letterAInNumericVersion = letterA;
        System.out.println(letterAInNumericVersion);

        //Please write a Java program which declares,
        // assign values of each primitive data type
        // and print out in console the result
        byte byteNumber = 1;
        short shortNumber = 2;
        int intNumber = 3;
        long longNumber = 4;
        float floatNumber = 5.0f;
        double doubleNumber = 6.0;
        char charChar = 'c';
        boolean booleanValue = false;

        System.out.println("Byte Number is: " + byteNumber);
        System.out.println("Short Number is: " + shortNumber);
        System.out.println("Int Number is: " + intNumber);
        System.out.println("Long Number is: " + longNumber);
        System.out.println("Float Number is: " + floatNumber);
        System.out.println("Double Number is: " + doubleNumber);
        System.out.println("Char is: " + charChar);
        System.out.println("Boolean is: " + booleanValue);
    }
}
