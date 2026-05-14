import java.util.Scanner;
/**
 * Technical Reference: Java Scanner Class
 * This module demonstrates how to parse different tokens from the input stream.
 */
public class ScannerGuide {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("-- Java Scanner Technical Guide --");

        // 1. Handling Strings (Tokens vs Lines)
        System.out.println("Enter a full sentence: ");
        if (console.hasNextLine()){
            String fullSentence = console.nextLine();
            System.out.println("Captured using nextLine(): " + fullSentence);
        }

        // 2. Handling Numeric Types with Validation
        System.out.println("Enter a decimal value (double): ");
        if (console.hasNextDouble()){
            double value = console.nextDouble();
            System.out.println("Successfully parsed as double: " + value);
        }else {
            System.out.println("Error: Input was not a valid double.");
            console.next(); // Clear the invalid token
        }

        // 3. Handling Booleans
        System.out.println("Is this a professional reference? (true/false): ");
        if (console.hasNextBoolean()){
            boolean isProfessional = console.nextBoolean();
            System.out.println("Boolean state: " + isProfessional);
        }

        // 4. Handling Long integers (For large IDs or National IDs)
        System.out.println("Enter a large ID (long): ");
        if (console.hasNextLong()){
            long nationalId = console.nextLong();
            System.out.println("Successfully parsed as long: " + nationalId);
        } else {
            System.out.println("Error: Input was not a valid long.");
            console.next();
        }

        // 5. Handling Short (16-bit signed integer)
        System.out.println("Enter a small number (short): ");
        if (console.hasNextShort()){
            short smallNum = console.nextShort();
            System.out.println("Short value stored: " + smallNum);
        }

        // 6. Handling Character (Trick: charAt(0))
        // Note: Scanner doesn't have a nextChar() method
        System.out.println("Enter a single character: ");
        char character = console.next().charAt(0);
        System.out.println("Captured first character: " + character);

        System.out.println("\n --- Guide Completed --- ");
        console.close();
    }
}
