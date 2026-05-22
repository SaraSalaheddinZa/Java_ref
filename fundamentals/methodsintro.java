// This is a method which is a task for a Java program that is performed as soon as you run your code.
// all the methods has a pair of parentheses, suffix to their names and a pair of curly braces.
public class methodsintro {
    // Array for storing the names of ingredients.
    static String[] ingredients;

    // variable for storing the status of the sandwich, whether it is ready or not
    static boolean sandwichReady;
    //the method should be out of the main method
    public static void gatherIngredients(){
        // place the ingredients in the array
        ingredients = new String[4];
        ingredients[0] = "bread";
        ingredients[1] = "chicken slices";
        ingredients[2] = "cheese slices";
        ingredients[3] = "lettuce";
        System.out.println("All ingredients arranges.");
    }

    public static void assembleSandwich(){
        if (ingredients.length == 4){
            if (ingredients[0].equals("bread") &&
                    ingredients[1].equals("chicken slices") &&
                    ingredients[2].equals("cheese slices") &&
                    ingredients[3].equals("lettuce")){
                System.out.println("Assembling the sandwich...");
                sandwichReady = true;
            }
        }
        else {
            System.out.println("Oops! missing required ingredients.");
        }
    }

    public static void serveSandwich(){
        if (sandwichReady == true){
            System.out.println("Serving a sandwich");
        } else {
            System.out.println("It's taking some time, please wait!");
        }

    }
    public static void main(String[] args){
        // we have to call all the method here!
        gatherIngredients();
        assembleSandwich();
        serveSandwich();
    }
}
