import java.util.Scanner;
public class CoffeeMachine {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CoffeeMaker cafeCoffeeMaker = new CoffeeMaker();
        while (true){
            System.out.println("\nWelcome to the Coffee Machine!");
            System.out.println("Select an option to continue: ");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.println("Enter your choice (1, 2, or 3): ");

            int choice = keyboard.nextInt();

            switch (choice){
                case 1:
                    String espressoName = "Espresso";
                    double espressoPrice = 2.50;

                    System.out.println("What Roast would you like? (light, medium, dark): ");
                    String espressoRoast = keyboard.next();

                    System.out.println("How many servings would you like? (a number please): ");
                    int numberOfShots = keyboard.nextInt();

                    Espresso espresso = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);
                    espresso.grindBeans();
                    espresso.brewCoffee();
                    espresso.printInfo();

                    cafeCoffeeMaker.prepareCoffee(espresso);
                    espresso.printInfo();
                    break;
                case 2:
                    String latteName = "Latte";
                    double lattePrice = 3.50;

                    System.out.println("What Roast would you like? (light, medium, dark): ");
                    String latteRoast = keyboard.next();

                    System.out.println("What milk would you like? (whole, skim, almond, oat): ");
                    String milkType = keyboard.next();

                    System.out.println("Would you like syrup? (yes/no): ");
                    String syrupWanted = keyboard.next();

                    String syrupFlavor = "no";
                    if (syrupWanted.equals("yes")){
                        System.out.println("Which flavor would you like? (vanilla, caramel, hazelnut): ");
                        syrupFlavor = keyboard.next();
                    }

                    Latte latte = new Latte(latteName, latteRoast, lattePrice, milkType, syrupFlavor);
                    latte.grindBeans();
                    latte.brewCoffee();
                    latte.printInfo();
                    break;

                case 3:
                    System.out.println("Thank you for using the Coffee Machine!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
