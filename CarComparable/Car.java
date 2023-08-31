public class Car implements Comparable<Car> {
    private String name;
    private String type;
    private int horsePower;

    
    public Car(String name, String type, int horsePower) {
        this.name = name;
        this.type = type;
        this.horsePower = horsePower;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %d", getName(), getType(), getHorsePower());
    }

    @Override
    public int compareTo(Car o) {
        if (getHorsePower() != o.getHorsePower()) {
            return getHorsePower() - o.getHorsePower();
        }
        else if (!getType().equals(o.getType())){
            return getType().compareTo(o.getType());
        }
        else {
            return getName().compareTo(o.getName());
        }
    }
    
}