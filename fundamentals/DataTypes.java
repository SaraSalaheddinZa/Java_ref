public class DataTypes {
    public static void main (String [] args){
        // ---------- Variables and initializing ----------
        //int playerScore = 150;
        //int x = 200;
        //int sum = playerScore + x;
        //System.out.println(sum);

        // ---------- double ----------
        //double x = 23.5;
        //double y = 43.9;
        //double mult = x * y;
        //System.out.println(mult);
        // results: 1031.6499999999999

        // ---------- Char and String ----------
        //in char the value must be enclosed in single quotation marks
        // use char for just one letter, symbol, and number
        // we use String almost for everything
        // Make sure to write the String with a big letter

        //char x = '&' ;
        //String y = "sara";
        //String z = "yasmin";
        //String result = y + x + z;
        //System.out.println(result);

        // ---------- Example ----------
        // Declare and initialize variable
        int playerScore = 150;
        double playerAccuracy = 87.5;
        char playerGrade = 'A';
        String playerName = "Alex";
        boolean isGameOver = false;
        System.out.println("Player Name: " + playerName);
        System.out.println("Player Score: " + playerScore);
        System.out.println("Player Accuracy: " + playerAccuracy);
        System.out.println("Player Grade: " + playerGrade);
        System.out.println("Game Over? " + isGameOver);
        // Result:
        //Player Name: Alex
        //Player Score: 150
        //Player Accuracy: 87.5
        //Player Grade: A
        //Game Over? false
        //Update score and game status
        playerScore += 50;
        isGameOver = true;

        // Print updated info
        System.out.println("\nAfter Playing More: ");
        System.out.println("Updated Score: " + playerScore);
        System.out.println("Game Over? " + isGameOver);


    }
}
