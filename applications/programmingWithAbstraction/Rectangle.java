public class Rectangle extends Shape{
    private float width;
    private float height;
    private String lineColor;
    Rectangle(float w, float h){
        this.width = w;
        this.height = h;
        this.lineColor = "Black";
    }

    @Override
    public float calculateArea() {
        float area = this.width * this.height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width = " + this.width + " height = " + this.height);
    }

    @Override
    public float CalculatePerimeter() {
        return width + width + height + height;
    }
}
