public class Espresso extends Coffee {

    int numberOfShots;

    public Espresso(String name, String roast, double price, int numberOfShots){
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }

    @Override
    public void grindBeans() {
        super.grindBeans();
    }

    @Override
    public void brewCoffee(){
        super.brewCoffee();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("You asked for " + numberOfShots + " servings!");
        System.out.println("Every serving of Espresso costs " + price + "$. Your total bill is " + (price * numberOfShots) + "$.");
    }
}
