public class conditionStatement {
    public static void main(String[] args){
        // declare and initialize variable
        int amountOfMoney = 300;

        if(amountOfMoney >= 300){
            // Code to be executed when condition is true
            System.out.println("Go to Las Vegas");
        } else {
            // Code to be executed when condition of if-statement is false
            System.out.println("Think of the money spent");
        }

        // Another Type of conditional statement

        if (amountOfMoney >= 300){
            // Code to be executed when condition is true
            System.out.println("Go to Las Vegas.");
        } else if (amountOfMoney >= 200) {
            // Code to be executed when the condition of the if-statement with condition1 is false but condition2 is true
            System.out.println("Go to Hoover Dam.");
        } else if (amountOfMoney >= 100) {
            // Code to be executed when the condition of the if-statement with condition1 and condition2 both are false but condition3 is true
            System.out.println("Go to Area 51.");
        } else{
            // Code to be executed when none of the if-statements are true
            System.out.println("Go to parents house. No Diversions.");
        }
    }
}
