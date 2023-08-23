public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(double s) {
        super(s, s, s);
    }

    @Override
    public String getType() {
        return "Equilateral Triangle";
    }
}
