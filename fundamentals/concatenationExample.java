public class concatenationExample {
    public static void main (String [] args){
        // Concatenation is the process of linking two or more strings together using the plus (+) operator.
        String firstName = "Sara";
        String lastName = "Ace";
        String fullName = firstName + " " + lastName; // plus (+) is used for concatenation.
        System.out.println(fullName);

        // Another Example and this time with numbers
        int levelOneScore = 5;
        int levelTwoScore = 10;
        String result = "Total Scored: " + levelOneScore + levelTwoScore;
        String concatenationResult = levelOneScore + " " + levelTwoScore;
        System.out.println(result);
        System.out.println(concatenationResult);

        // for summation:
        String sumResult = "Total Scored: " + (levelOneScore + levelTwoScore);
        System.out.println(sumResult);
    }
}
