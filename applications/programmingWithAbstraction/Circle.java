public class Circle extends Shape{
    private float radius;
    private String lineColor;

    // provide an instructor
    Circle(float r){
        this.radius = r;
        this.lineColor = "Black";
    }

    @Override
    public float calculateArea() {
        float area = (float) Math.PI * this.radius * this.radius;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with Radius: " + this.radius);
    }

    @Override
    public float CalculatePerimeter() {
        return 2 * (float)Math.PI * radius;
    }
}
