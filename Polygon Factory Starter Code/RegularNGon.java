public class RegularNGon implements Polygon{

	private int n;
	private double s;

	public RegularNGon(int n, double s) {
		this.n = n;
		this.s = s;
	}

	public double area() {
		return 0.5 * perimeter() * ((s / 2) / Math.tan(Math.PI/n));
	}

	public double perimeter() {
		return n * s;
	}

	public String getType() {
		return "regular " + n + "-gon";
	}
}
