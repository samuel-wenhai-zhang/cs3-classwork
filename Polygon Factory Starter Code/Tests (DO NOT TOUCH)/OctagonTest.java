import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OctagonTest {
    
    @Test
    void octagonAreaTest1() {
        Octagon t = new Octagon(3);
        double area = t.area();
        assertEquals(43.45584412271572, area);
    }

    @Test
    void octagonAreaTest2() {
        Octagon t = new Octagon(5.8);
        double area = t.area();
        assertEquals(162.42828847646183, area);
    }

    @Test
    void octagonAreaTest3() {
        Octagon t = new Octagon(100.55);
        double area = t.area();
        assertEquals(48816.85883038922, area);
    }

    @Test
    void octagonPerimeterTest1() {
        Octagon t = new Octagon(3);
        double p = t.perimeter();
        assertEquals(24.0, p);
    }

    @Test
    void octagonPerimeterTest2() {
        Octagon t = new Octagon(5.8);
        double p = t.perimeter();
        assertEquals(46.4, p);
    }

    @Test
    void octagonPerimeterTest3() {
        Octagon t = new Octagon(100.55);
        double p = t.perimeter();
        assertEquals(804.4, p);
    }

    @Test 
    void getTypeTest() {
        Octagon t = new Octagon(10);
        String type = t.getType();
        assertEquals(type, "regular octagon");
    }
}