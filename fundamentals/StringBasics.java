package fundamentals;
import java.util.Scanner;
public class StringBasics {
    public static void main(String[] args){
        String language = "Java";

        // 1. Calculate and display the string length
        int length = language.length();
        System.out.println("The length of the word is: " + length);

        // 2. Extract characters using index
        char firstLetter = language.charAt(0);
        char secondLetter = language.charAt(1);
        char thirdLetter = language.charAt(2);
        char fourthletter = language.charAt(3);

        System.out.println("Characters extracted manually: " + firstLetter + secondLetter + thirdLetter + fourthletter);

        // 3. Iterate through the string using a loop
        System.out.println("The word printed via loop: ");
        for (int i = 0; i < language.length(); i++){
            System.out.println(language.charAt(i));
        }
        System.out.println();

        // 4. additional methods
        System.out.println("Uppercase version: " + language.toUpperCase());
        System.out.println("Lowercase: " + language.toLowerCase());
        System.out.println("Does it start with 'J'? " + language.startsWith("J"));

        // Another Example for the length method
        String name = "Sara";
        int length1 = name.length();
        System.out.println("The length of the word is: " + length1);
    }
}
