public class IsoscelesTriangle extends Triangle{
    public IsoscelesTriangle(double b, double l) {
        super(b, l, l);
    }

    @Override
    public String getType() {
        return "Isosceles Triangle";
    }
}
