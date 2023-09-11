public abstract class Polygon implements Comparable<Polygon> {
    public abstract double area();
    public abstract double perimeter();
    public abstract String getType();

    @Override
    public String toString() {
        return String.format("Type: %s, Area: %.2f, Perimeter: %.2f", getType(), area(), perimeter());
    }

    @Override
    public int compareTo(Polygon o) {
        if (area() < o.area()) {
            return -1;
        }
        else if (area() > o.area()) {
            return 1;
        }
        else if (perimeter() < o.perimeter()) {
            return -1;
        }
        else if (perimeter() > o.perimeter()) {
            return 1;
        }
        else {
            return getType().compareTo(o.getType());
        }
    }
}