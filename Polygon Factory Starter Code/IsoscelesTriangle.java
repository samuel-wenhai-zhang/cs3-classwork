public class IsoscelesTriangle extends Triangle{
    public IsoscelesTriangle(double base, double leg) {
        super(base, leg, leg);
    }

    @Override
    public String getType() {
        return "Isosceles Triangle";
    }
}
