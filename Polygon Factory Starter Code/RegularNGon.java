public class RegularNGon implements Polygon{

  private double side;
  private double num;
  
  public double area() {
    return n * s * s * 4 * Math.tan(Math.toRadians(180/num))
  }

  public double perimeter() {
    
  }

  public String getType() {
    return "Regular Polygon";
  }
}
