package fundamentals;
/**
 * Data Types Reference
 * This class demonstrates the usage of primitive and non-primitive data types in Java.
 */
public class DataTypes {
    public static void main (String [] args){
        /* 
         * 1. NUMERIC TYPES
         * - int: Used for whole numbers (e.g., 150, 200).
         * - double: Used for decimal numbers (e.g., 23.5, 43.9).
         * Note: Precision may vary in complex calculations.
         */
        int playerScore = 150;
        double playerAccuracy = 87.5;

        /* 
         * 2. CHARACTER & TEXT
         * - char: Stores a single character, symbol, or number in single quotes ('&', 'A').
         * - String: A non-primitive type used for sequences of characters. 
         * Note: Strings must start with a capital 'S' in Java.
         */
        char playerGrade = 'A';
        String playerName = "Alex";

        /* 
         * 3. LOGICAL TYPE
         * - boolean: Represents true or false values.
         */
        boolean isGameOver = false;

        // --- Execution & Output ---
        System.out.println("Player Name: " + playerName);
        System.out.println("Score: " + playerScore);
        System.out.println("Accuracy: " + playerAccuracy + "%");
        System.out.println("Grade: " + playerGrade);
        System.out.println("Is Game Over? " + isGameOver);

        // Updating values
        playerScore += 50;
        isGameOver = true;

        System.out.println("\n--- Updated Stats ---");
        System.out.println("New Score: " + playerScore);
        System.out.println("Status: " + isGameOver);
    }
}
