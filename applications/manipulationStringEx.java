package applications;
public class manipulationStringEx {
    public static void main (String[] args){
        // First Example:
        String stringToBeDisplayed = "Next year, Please";
        String howWasLastYear = "He was good in his activity";
        if (howWasLastYear.contains("good")){
            stringToBeDisplayed = "You get a gift from santa";
        }
        System.out.println("Santa's Result: " + stringToBeDisplayed);

        // Second Example:
        String name1 = "santa";
        String name2 = "SANTA";
        if (name1.equalsIgnoreCase(name2)){
            System.out.println("The names are the same");
        }
    }
}
