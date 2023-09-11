import java.util.ArrayList;
import java.util.Collections;

public class SortablePolygonTester {
    public static void main(String[] args) {
        ArrayList<Polygon> polygons = new ArrayList<Polygon>();
        polygons.add(new EquilateralTriangle(10));
        polygons.add(new Hexagon(10));
        polygons.add(new IsoscelesTriangle(10, 7));
        polygons.add(new Octagon(10));
        polygons.add(new Pentagon(10));
        polygons.add(new Rectangle(10, 5));
        polygons.add(new RegularNGon(10, 10));
        polygons.add(new Triangle(15, 10, 7));

        polygons.add(new EquilateralTriangle(5));
        polygons.add(new Hexagon(5));
        polygons.add(new IsoscelesTriangle(7, 10));
        polygons.add(new Octagon(5));
        polygons.add(new Pentagon(5));
        polygons.add(new Rectangle(20, 10));
        polygons.add(new RegularNGon(20, 5));
        polygons.add(new Triangle(3, 4, 5));

        Collections.sort(polygons, Collections.reverseOrder());
        for (Polygon p : polygons) {
            System.out.println(p);
        }
        
    }
}