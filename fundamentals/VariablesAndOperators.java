package fundamentals;
class VariablesAndOperators {
    public static void main(String [] args) {
        // Arithmetic Operators
        int x = 6;
        double y = 9.5;
        // Addition
        System.out.println(x + y);
        System.out.println(x + "7");
        // Result: 15.5 | 67
        // Subtract
        System.out.println(y - x);
        // Result: 3.5
        // Multiply
        System.out.println(x * y);
        // Result: 57.0
        // Division
        System.out.println(x / y);
        // Result: 0.631578947368421

        // Relational Operator
        // Greater That >
        int player1Score = 95;
        int player2Score = 85;
        int player3Score = 73;
        System.out.println("player1Score > player2Score: " + (player1Score > player2Score));

        // Less Than <
        System.out.println("player1Score < player2Score: " + (player1Score < player2Score));

        // Logical Operators
        // && And, || OR, ! NOT
        // AND operator, output result: true
        System.out.println("player1Score > player2Score && player1Score > player3Score: " + (player1Score > player2Score && player1Score > player3Score));

        // OR operator, output result: true
        boolean isPremiumMember = false;
        boolean isAdmin = true;
        System.out.println("Does user has access to the premium feature: " +
                (isPremiumMember || isAdmin));

        // NOT ! operator, output result: false
        boolean isAuthenticated = true;
        System.out.println("Inverse of isAuthenticated: " + !isAuthenticated);
    }
}
