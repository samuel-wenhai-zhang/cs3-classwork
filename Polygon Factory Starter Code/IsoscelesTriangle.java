public class IsoscelesTriangle extends Triangle{
    public IsoscelesTriangle(double leg, double base) {
        super(leg, leg, base);
    }

    @Override
    public String getType() {
        return "isosceles triangle";
    }
}
