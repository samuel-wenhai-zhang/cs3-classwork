public class RegularNGon implements Polygon{

  private double n;
  private double s;

  public RegularNGon(double n, double s) {
    this.n = n;
    this.s = s;
  }
  
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
