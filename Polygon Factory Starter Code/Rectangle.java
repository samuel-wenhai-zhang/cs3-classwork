public class Rectangle implements Polygon {
    private double length;
    private double width;

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String getType() {
        return "Rectangle";
    }
}
