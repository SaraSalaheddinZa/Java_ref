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

        // substring(start, end) --> This method gives you a part of the String from the start to the end position
        String fruit = "Banana";

        String partFrom1To4 = fruit.substring(1, 4);
        String partFrom4TTo5 = fruit.substring(4,6);

        System.out.println("The full string is: " + fruit);
        System.out.println("The substring from index 1 to 4. 4 excluded: " + partFrom1To4);
        System.out.println("The substring from 4 to 5. 5 excluded: " + partFrom4TTo5);

        // Another Example of substring:
        String text = "subscription";
        String extractedText = text.substring(1, 4);
        System.out.println("The full string is: " + text);
        System.out.println("The substring from index 1 to 4: " + extractedText);

        // equals(anotherString) --> This method checks if two Strings are the same.
        String pLanguage = "Java";
        String pLanguage1 = "Python";
        String pLanguage2 = "Kotlin";
        String pLanguage3 = "Python";
        // Will be false since the case do not match.
        boolean result = pLanguage.equals(pLanguage2);
        // Will be true since the case matches
        boolean result1 = pLanguage1.equals(pLanguage3);

        System.out.println("Using equals() method \"" + pLanguage + "\" is equal to \"" + pLanguage2 + "\": " + result);
        System.out.println("Using equals() method \"" + pLanguage1 + "\" is equal to \"" + pLanguage3 + "\": " + result1);

        // contains(sequence) --> This method checks if a sequence of characters is present in the String. It’s like checking if your necklace has a certain sequence of beads.
        String fruit1 = "Banana";
        // Will be true since the case matches
        boolean hasBan = fruit1.contains("Ban");
        // Will be false since the case do not match.
        boolean hasBreeds = fruit1.contains("Breeds");
        System.out.println("The fruit: \"" + fruit + "\"");
        System.out.println("The fruit \"" + fruit + "\" contains the substring \"Ban\": " + hasBan);
        System.out.println("The fruit \"" + fruit + "\" contains the substring \"Breeds\": " + hasBreeds);

        //  replace(oldChar, newChar) --> This method replaces all occurrences of a character with a new character. It’s like swapping one kind of bead on your string for another.
        String word = "happle";
        // the result will be "papple"
        String fruitWithLetterReplaced = word.replace('h', 'p');
        System.out.println("The fruit: \"" + word + "\"");
        System.out.println("The fruit: \"" + word + "\" with character \"h\" replaced with character \"p\": " + fruitWithLetterReplaced);

        // Exercise:
        String text1 = "Adventure";
        // Check the length using length() and print the length.
        int lengthOfTheWord = text1.length();
        System.out.println("The length of the word Adventure is: " + lengthOfTheWord);
        // Return the character at position 3 using charAt() and print the character.
        char index = text1.charAt(2);
        System.out.println("The letter in position 3 is: " + index);
        // Return part of the String from position 1 to 4 using substring() and print the string.
        String subWord = text1.substring(0, 4);
        System.out.println("The sub word from Adventure is: " + subWord);
        String anotherText= "Adventure";
        // Compare text with anothertext using equals() and print the output.
        boolean isTheSameWord = anotherText.equals(text1);
        System.out.println("Is the same word? " + isTheSameWord);
        // Change the String to upper case using toUpperCase() and print the converted string.
        String upperCaseWord = anotherText.toUpperCase();
        System.out.println("UpperCase = " + upperCaseWord);
        // Change it to lowercase using toLowerCase() and print the converted string.
        String lowerCaseWord = anotherText.toLowerCase();
        System.out.println("LowerCase = " + lowerCaseWord);
        // Check if the String contains “vent” using contains() and print the output.
        boolean CheckWord = anotherText.contains("vent");
        System.out.println("Is the word contains vent word? " + CheckWord);
        // Replace all occurrences of ‘e’ with ‘a’ using replace() and print the output.
        String replaceSpe = anotherText.replace('e', 'a');
        System.out.println("The new word is: " + replaceSpe);

        // Another Exercise:
        // Declare and initialize the variable firstName = “Harry”.
        String firstName = "Harry";
        // Declare and initialize the variable lastName = “Grow”.
        String lastName = "Grow";
        // Declare and initialize the variable email = “harry.grow@example.com”.
        String email = "harry.grow@example.com";
        // Using the method toLowerCase() and the + operator, concatenate firstName and lastName after converting it to lowercase, then assign it to the variable username.
        String textMerge = firstName.toLowerCase() + lastName.toLowerCase();
        System.out.println("'username' after conversion and concatenation: " + textMerge);
        // Correct the email address from “example.com” to “gmail.com”.
        String updateEmail = email.replace("example", "gmail");
        System.out.println("'email' after replacing example.com with gmail.com: " + updateEmail);
        // Find the index of ‘@’ in the email address.
        int index1 = email.indexOf('@');
        System.out.println("index of @ in the email address is: " + index1);


    }
}


