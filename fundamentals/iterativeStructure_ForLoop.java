/*
 * Iterative Structures in Java
 * Example: FOR LOOP
 *
 * A for loop is used when we know how many times we want to repeat an action.
 */
public class iterativeStructure_ForLoop {
    public static void main(String[] args){
        // Loop Counter Variable
        int turkeyNumber;
        /*
         * FOR LOOP STRUCTURE
         *
         * for (initialization ; condition ; update)
         */
        for (turkeyNumber = 1; turkeyNumber <= 5; turkeyNumber++){
            System.out.println("This is turkey no: " + (turkeyNumber + 1));
        }
        System.out.println("\n----- AFTER THE LOOP -----");

        // Notice the final value after loop finishes
        System.out.println("Final value of turkeyNumber = " + turkeyNumber);
    }
}
