package applications;
/*
     Constructor is a special method with the same name as the class, and it is called automatically whenever you create a new object.
     It initializes the object’s state (attribute values) during creation. They are called whenever you create an object using the new keyword.
     There are three types of constructors to consider:
     1. Default constructors.
     2. No-argument constructors.
     3. Parameterized constructors.
 */

class CarInfo {
    // Default Constructor: If you don’t define any constructors in your class, Java will create a default constructor
    // This default constructor typically initializes all numeric attributes to 0 and Strings to null.
    String make;
    String model;
    String color;

    // No-argument constructor (no parameter): is a custom constructor that doesn’t take any arguments when called. This lets you define specific default values for your object’s properties.
    public CarInfo(){
        // this keyword is used within a constructor to refer to the current object being created.
        this.make = "Unknown";
        this.model = "Unknown";
        this.color = "Black";
    }
    //  parameterized constructors: These constructors take arguments (parameters) that allow you to provide specific values for the object's attributes during creation.
    // Parameterized constructor to initialize with specific values
    public CarInfo(String make, String model, String color){
        this.make = make;
        this.model = model;
        this.color = color;
    }
    /* the default constructor would assign the following values: 1. make: null (as it’s a String) 2. model: null (as it’s a String) 3. color: null (as it’s a String) */
    public void accelerate(){
        System.out.println("The car is accelerating!");
    }

    public void turn(){
        System.out.println("The car is turning!");
    }

    @Override
    public String toString() {
        return "CarInfo{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", color='" + color + '\'' + '}';
    }

    public static void main (String [] args){
        // Uses the default constructor to create a Car Object
        CarInfo colorado = new CarInfo("Chevrolet ", "Colorado", "Red");

        // Optional: Print the object to see the default null values
        System.out.println(colorado);
    }
} // This single brace now properly closes the CarInfo class

