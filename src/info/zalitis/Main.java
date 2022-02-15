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
    }
}
