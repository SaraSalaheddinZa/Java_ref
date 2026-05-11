package fundamentals;
import java.util.Optional;

public class manipulatingString {
    public static void main(String[] args){
        //When calling a method, you specify a variable or value. The variable or value that invokes the method is known as the caller.
        // example of how to specify a variable named welcomeToJavaString to be the caller of a method named toUpperCase().
        String welcomeToJava = "welcome java";
        String welcomeToJavaStringInUpperCase = welcomeToJava.toUpperCase();
        System.out.println("The string " + welcomeToJava + " in upper case is: " + welcomeToJavaStringInUpperCase);

        //how to specify a String to be the caller of a method named toUpperCase().
        String welcomeUseDirectString = "welcome java".toUpperCase();
        System.out.println("The string Welcome java in upper case is : " + welcomeUseDirectString );

        // Identify a String
        // A String can consist of any number of characters or a combination of Strings. If one String exists inside another String, it’s called a substring.
        String testString = "This is a test";
        // we use startsWith(String prefix) method to explore how to identify if a String starts with another String
        boolean result1 = testString.startsWith("test");
        boolean result2 = testString.startsWith("this");

        System.out.println("testString.startWith(\"test\") :" + result1);
        System.out.println("testString.startsWith(\"This\") : " + result2);
        // check if a String ends with another String by employing the method endsWith(String suffix)
        boolean result3 = testString.endsWith("test");
        boolean result4 = testString.endsWith("This");
        System.out.println("tesString.endWith(\"test\") : " + result3);
        System.out.println("tesString.endWith(\"This\") : " + result4);

        //Checking for empty Strings
        String testString1 = "This is a test";
        String testString2 = "";
        boolean stringEmpty1 = testString1.isEmpty();
        boolean stringEmpty2 = testString2.isEmpty();

        System.out.println("testString1.isEmpty(): " + stringEmpty1);
        System.out.println("testString2.isEmpty(): "+ stringEmpty2);

        // Manipulate a String with index numbers
        String testString3 = "This is a test which is nice";
        int indexOfSearch1 = testString3.indexOf("Java");
        int indexOfSearch2 = testString3.indexOf("is");
        int indexOfSearch3 = testString3.indexOf("est");
        //  indexOfSearch1 is -1 because the string Java is not in testString3. indexOfSearch2 is 2 because the first occurrence of the substring "is" starts at index position 2. indexOfSearch3 is 11 because it finds "est" in "test" at index 11.
        System.out.println("testString.indexOf(\"Java\") : " + indexOfSearch1);
        System.out.println("testString.indexOf(\"is\") : " + indexOfSearch2);
        System.out.println("testString.indexOf(\"est\") : " + indexOfSearch3);

        // create a new String by removing characters from the original String by specifying the start index number.
        String testString4 = "This is a test";
        String result5 = testString4.substring(3);
        String result6 = testString4.substring(12);
        System.out.println("testString.substring(3) : " + result5);
        System.out.println("testString.substring(12) : " + result6);

        // The  trim()method can be utilized to eliminate leading and trailing spaces
        String testString5 = "     This is a test    ".trim();
        System.out.println("The test without spaces: " + testString5);

        // Compare Strings
        // To explore if two Strings are equal without considering case sensitivity, use the syntax  equalsIgnoreCase(String stringToCompare)
        // If you need to compare Strings with case sensitivity, you should use the equals() and for case insensitive comparison use equalsIgnoreCase() methods instead.
        String tString = "Java";
        boolean res = tString.equalsIgnoreCase("java");
        boolean res1 = tString.equalsIgnoreCase("JAVA");
        System.out.println("tString.equalsIgnoreCase(\"java\") : " + res);
        System.out.println("tString.equalsIgnoreCase(\"JAVA\") : " + res1);

        // if you want to distinguish between upper and lowercase. For example, you can use the compareTo(String stringToCompare)
        int res2 = tString.compareTo("java");
        int res3 = tString.compareTo("JAVA");
        int res4 = tString.compareToIgnoreCase("java");
        int res5 = tString.compareToIgnoreCase("JAVA");

        System.out.println("---------- Comparing with respect to case ----------");
        System.out.println("tString.compareTo(\"java\") : " + res2);
        System.out.println("testString.compareTo(\"JAVA\") : " +  res3);

        System.out.println("---------- Comparing irrespective of case ----------");
        System.out.println("tString.compareToIgnoreCase(\"java\") : " + res4);
        System.out.println("testString.compareToIgnoreCase(\"JAVA\") : " +  res5);

        // Identify a password
        // equals(): This method checks if two Strings are exactly the same, including the case of each letter. It returns true if the Strings match perfectly and false if they don’t.
        // compareTo(): This method compares two Strings lexicographically and returns a number. If the Strings are exactly the same, it returns 0. If the first String comes before the second one alphabetically, it returns a negative number; if it comes after, it returns a positive number
        String password = "Sara@maxiq*";
        if (password.equals("Sara@maxiq*")){
            System.out.println("Welcome!");
        }

        // another example
        if (password.compareTo("Sara@maxiq*") == 0){
            System.out.println("Welcome");
        }

        // Determine if a String is empty
        String isEmpty = "";
        if (isEmpty.isEmpty()){
            System.out.println("The string is empty");
        }

        // Determine if a String contains a substring using contains() method
        String fullName = "Tim Berners Lee";
        String familyName = "Lee";
        if (fullName.contains(familyName)){
            System.out.println("The family name: " + familyName + " exist in the name: " + fullName);
        }

        // Compare two Strings
        String text = "This is java";
        String upperCaseString1 = text.toUpperCase();
        if (text.equals(upperCaseString1)){
            System.out.println("Value of text is equal to its uppercase version");
        }

        String tex2 = "THIS IS JAVA";
        String upperCaseTestString = tex2.toUpperCase();
        if(tex2.equals(upperCaseTestString)){
            System.out.println("Value of testString2 is equal to is uppercase version");
        }
    }
}
