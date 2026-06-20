import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Calculating Area of Rectangle: ");
        System.out.print("Enter width: ");
        float w = keyboard.nextFloat();
        System.out.println("Enter height: ");
        float h = keyboard.nextFloat();


        Rectangle rct = new Rectangle(w, h);
        rct.draw();
        System.out.println("Area: " + rct.calculateArea());
        System.out.println("Calculating perimeter of rectangle: ");
        System.out.println("Perimeter: " + rct.CalculatePerimeter());

        System.out.println("Calculating Area of Circle: ");
        System.out.println("Enter Radius: ");
        float r = keyboard.nextFloat();
        Circle cr = new Circle(r);

        cr.draw();
        System.out.println("Area: " + cr.calculateArea());

        System.out.println("Calculating perimeter of circle: ");
        System.out.println("Perimeter: " + cr.CalculatePerimeter());
    }
}
