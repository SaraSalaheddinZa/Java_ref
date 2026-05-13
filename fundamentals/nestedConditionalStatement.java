/**
 * Concept: Nested Conditions
 * Description: Decision-making based on budget and interests.
 */
public class nestedConditionalStatement {
    public static void main(String[] args){

        int amountOfMoney = 299;
        // 1st level if-statement
        if (amountOfMoney < 300){
            // 2nd level if-statement inside 1st level if-statement
            if (amountOfMoney < 200){
                // code executed when 2nd level if-statement if true
                System.out.println("No Diversions.");
            } else {
                // 2nd level else-statement of 2nd level if-statement
                boolean hasInterestInHistory = false;
                if (hasInterestInHistory){
                    System.out.println("Go to hoover Dam");
                } else {
                    System.out.println("Go to Area 51");
                }
            }
        } else {
            // 1st level else-statement which executes when 1st level if-statement is false
            System.out.println("Go to las vegas.");
        }
        // Note: Avoid nesting more than three levels
    }
}
