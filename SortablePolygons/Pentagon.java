public class Pentagon extends RegularNGon{
    public Pentagon(double s) {
        super(5, s);
    }

    @Override
    public String getType() {
        return "regular pentagon";
    }
}
