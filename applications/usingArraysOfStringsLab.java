public class usingArraysOfStringsLab {
    public static void main (String[] args){
        // Declare and initialize an array
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        System.out.println("Superhero Names:");
        System.out.println(superheroes[0]);
        System.out.println(superheroes[1]);
        System.out.println(superheroes[2]);
        System.out.println(superheroes[3]);
        System.out.println(superheroes[4]);

        System.out.println("Introduction Years:");
        System.out.println(introductionYears[0]);
        System.out.println(introductionYears[1]);
        System.out.println(introductionYears[2]);
        System.out.println(introductionYears[3]);
        System.out.println(introductionYears[4]);

        // write a statement to print the original name of the superhero at the third position
        System.out.println("Original superhero name at position 3: " + superheroes[2]);
        //  modify the name of one of the superheroes
        superheroes[2] = "Thor";
        // write a statement to print the new modified name of the superhero at the third position
        System.out.println("Modified superhero name at position 3: " + superheroes[2]);


        System.out.println("Original introduction year for superhero at position 3: " + introductionYears[2]);
        introductionYears[2] = 2011;
        System.out.println("Modified introduction year for superhero at position 3: " + introductionYears[2]);

        //  print the length of the array containing superhero names
        System.out.println("Total superheroes in String array: " + superheroes.length);
        // print the length of the array containing superhero year of introduction
        System.out.println("Total superheroes introduction year in int array: " + introductionYears.length);
    }
}
