// Import Scanner
import java.util.Scanner;
/*
 * Building Schedule Lab
 * ----------------------------------------
 * Concepts Covered:
 * 1. switch statement
 * 2. if - else decisions
 * 3. Nested conditional statements
 * 4. User input using Scanner
 * 5. Method decomposition
 */
public class buildingScheduleLab {
    // CONSTANTS
    final static int Monday = 1;
    final static int Tuesday = 2;
    final static int wednesday = 3;
    final static int Thursday = 4;
    final static int Friday = 5;
    final static int Saturday = 6;
    final static int Sunday = 7;
    public static void main(String[] args){
        // Create a Scanner variable names "keyboard"
        Scanner keyboard = new Scanner(System.in);

        // Initialize the variable
        int dayOfTheWeek;


        // Display a menu to get the day of the week from the user
        System.out.println("********** MENU *****************");
        System.out.println("These are the choices for week of the day. \\n Please enter only values from 1-7:");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("3. WEDNESDAY");
        System.out.println("4. THURSDAY");
        System.out.println("5. FRIDAY");
        System.out.println("6. SATURDAY");
        System.out.println("7. SUNDAY");
        System.out.println("***********************************");

        // Input Validation
        if (!keyboard.hasNextInt()){
            System.out.println("Please enter numbers only.");
            keyboard.close();
            return;
        }
        // use the keyboard variable to read an integer into the variable dayOfTheWeek
        dayOfTheWeek = keyboard.nextInt();

        // ---------- SWITCH DECISION ----------
        switch (dayOfTheWeek) {
            case Monday:
                handleMonday(keyboard);
                break;
            case Tuesday:
                handleTuesday(keyboard);
                break;
            case wednesday:
                handleWednesday(keyboard);
                break;
            case Thursday:
                handleThursday(keyboard);
                break;
            case Friday:
                handleFriday(keyboard);
                break;
            case Saturday:
                handleSaturday(keyboard);
                break;
            case Sunday:
                handleSunday(keyboard);
                break;
            default:
                System.out.println("Invalid day: Please enter a number between 1 and 7.");
        }
        keyboard.close();
    }
    // ---------- MONDAY ----------
    public static void handleMonday(Scanner keyboard){
        int subChoice;
        System.out.println("Monday: Back to work!");
        System.out.println("Did you eat your breakfast?: ");

        System.out.println("*********** SUB MENU FOR MONDAY ******");
        System.out.println("1. Yes, I had my breakfast");
        System.out.println("2. No, I would like one.");
        System.out.println("**************************************");

        System.out.println("Please enter your choice: ");
        subChoice = keyboard.nextInt();
        // Nested Decision (if inside switch)
        if (subChoice == 1){
            System.out.println("Good. Now you have a catchup meeting at 9AM prepare your notes! good luck");
        } else if (subChoice == 2) {
            System.out.println("Let's grab a burger on Highway 54.");
        } else {
            System.out.println("No such choice available.");
        }
    }
    // ---------- TUESDAY ----------
    public static void handleTuesday(Scanner keyboard){
        int langChoice;
        System.out.println("Tuesday: Coding Time!");
        System.out.println("Choose language: ");
        System.out.println("1. Java");
        System.out.println("2. C++");
        langChoice = keyboard.nextInt();

        switch (langChoice){
            case 1:
                System.out.println("Java: Work on Spring Boot skills.");
                break;
            case 2:
                System.out.println("C++: Focus on memory management.");
                break;
            default:
                System.out.println("Language not in schedule.");
        }
    }
    // ---------- WEDNESDAY ----------
    public static void handleWednesday(Scanner keyboard){
        int designType;
        System.out.println("Wednesday: Design Time!");
        System.out.println("1. Simple design");
        System.out.println("2. Complex design");
        designType = keyboard.nextInt();
        if (designType == 1){
            System.out.println("Simple design: clean and beautiful.");
        } else if (designType == 2) {
            System.out.println("Complex design: professional choice.");
        } else {
            System.out.println("Not in the list.");
        }
    }
    // ---------- THURSDAY ----------
    public static void handleThursday(Scanner keyboard){
        int IDE;
        System.out.println("Thursday: Choose your IDE");
        System.out.println("1. IntelliJ");
        System.out.println("2. Eclipse");
        System.out.println("3. VS Code");
        IDE = keyboard.nextInt();
        switch (IDE){
            case 1:
                System.out.println("intellij: Great choice.");
                break;
            case 2:
                System.out.println("Eclipse! Great choice.");
                break;
            case 3:
                System.out.println("VS Code: Great choice.");
                break;
            default:
                System.out.println("Still a great choice!");
        }
    }
    // ---------- FRIDAY ----------
    public static void handleFriday(Scanner keyboard){
        int funPlace;
        System.out.println("Friday: Time to relax!");
        System.out.println("1. Home");
        System.out.println("2. With friends");
        System.out.println("3. Cinema");
        funPlace = keyboard.nextInt();

        if (funPlace == 1){
            System.out.println("Home: Comfortable choice.");
        } else if (funPlace == 2){
            System.out.println("With friends: Fun!.");
        } else if (funPlace == 3){
            System.out.println("Cinema: Enjoy the movie!");
        } else {
            System.out.println("Have fun anyway!");
        }
    }
    // ---------- SATURDAY ----------
    public static void handleSaturday(Scanner keyboard){
        int drinks;
        System.out.println("Saturday: Drink time!");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Ice Tea");
        System.out.println("4. Cold Water");
        drinks = keyboard.nextInt();
        if (drinks == 1){
            System.out.println("Coffee: Delicious!.");
        } else if (drinks == 2) {
            System.out.println("Tea: Delicious!.");
        } else if (drinks == 3) {
            System.out.println("Ice tea: Delicious!.");
        } else if (drinks == 4) {
            System.out.println("Cold water: Refreshing!");
        } else {
            System.out.println("Still a good drink!");
        }
    }
    // ---------- SUNDAY ----------
    public static void handleSunday(Scanner keyboard){
        int work;
        System.out.println("Sunday: Work mode!");
        System.out.println("1. Work from home");
        System.out.println("2. Work at company");
        work = keyboard.nextInt();
        switch (work){
            case 1:
                System.out.println("Work from home: Comfortable!");
                break;
            case 2:
                System.out.println("Work at company: Productive!");
                break;
            default:
                System.out.println("Not in the list!");
        }
    }
}
