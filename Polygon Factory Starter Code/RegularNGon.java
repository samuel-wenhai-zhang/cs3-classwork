public class RegularNGon implements Polygon{

  private double s;
  private double n;
  
  public double area() {
    return n * s * s * 4 * Math.tan(Math.toRadians(180/num));
  }

  public double perimeter() {
    return n * s;
  }

  public String getType() {
    return "Regular Polygon";
  }
}
