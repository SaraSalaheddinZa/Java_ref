import java.util.Scanner; // 1. Import

public class UserValidation {
    public static void main(String [] args){
        // 2. Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // 3. Message for the user
        System.out.println("Please enter your username: ");
        // 4. Store the input in a String variable
        String username = input.nextLine();
        // 5. apply the validation logic
        if (username.length() > 10){
            System.out.println("Error: Username is too long (Max 10 characters).");
        } else {
            System.out.println("Welcome, " + username + "!");
            System.out.println("Your name length is: " + username.length());
        }
        // close the scanner
        input.close();
    }
}
