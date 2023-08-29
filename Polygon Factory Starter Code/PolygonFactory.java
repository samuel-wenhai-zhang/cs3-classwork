import java.util.*;
import java.io.*;

public class PolygonFactory {
    public static void main(String[] args) throws IOException {
        System.out.println("**********************************************************\n");
        System.out.println("Welcome to the Polygon Factory!\n");
        System.out.println("**********************************************************");

        // your code here
        Scanner input = new Scanner(System.in);
        ArrayList<Polygon> polygons = new ArrayList<Polygon>();
        int choice;
        ArrayList<Double> sides = new ArrayList<Double>();

        outerLoop:
        while (true) {
            choice = getChoice(input, "Do you want to:", new String[] {"Create a new polygon", "Display polygons", "Quit"});
            switch (choice) {
                case 1:
                    choice = getChoice(input, "What type of polygon is it?", new String[] {"Triangle", "Rectangle", "Pentagon", "Hexagon", "Octagon"});
                    switch (choice) {
                        case 1:
                            choice = getChoice(input, "What type of triangle is it?", new String[] {"Isosceles", "Equilateral", "Neither of these"});
                            switch (choice) {  
                                case 1: 
                                    sides = getSides(input, new String[] {"leg", "base"}, "isosceles triangle");
                                    addPolygon(polygons, new IsoscelesTriangle(sides.get(0), sides.get(1)));
                                    break;
                                case 2:
                                    sides = getSides(input, new String[] {"side length"}, "equilateral triangle");
                                    addPolygon(polygons, new EquilateralTriangle(sides.get(0)));
                                    break;
                                case 3:
                                    sides = getSides(input, new String[] {"1st side length", "2nd side length", "3rd side length"}, "triangle");
                                    addPolygon(polygons, new Triangle(sides.get(0), sides.get(1), sides.get(2)));
                                    break;
                            }
                            break;
                        case 2:
                            sides = getSides(input, new String[] {"width", "length"}, "rectangle");
                            addPolygon(polygons, new Rectangle(sides.get(0), sides.get(1)));
                            break;
                        case 3:
                            sides = getSides(input, new String[] {"side length"}, "pentagon");
                            addPolygon(polygons, new Pentagon(sides.get(0)));
                            break;
                        case 4:
                            sides = getSides(input, new String[] {"side length"}, "hexagon");
                            addPolygon(polygons, new Hexagon(sides.get(0)));
                            break;
                        case 5:
                            sides = getSides(input, new String[] {"side length"}, "octagon");
                            addPolygon(polygons, new Octagon(sides.get(0)));
                            break;
                    }
                    break;
                case 2:
                    if (polygons.size() == 0) {
                        System.out.println("\nNo polygons available.");
                    } else {
                        choice = choosePolygon(input, polygons);
                        displayPolygon(polygons.get(choice - 1));
                    }
                    break;
                case 3:
                    System.out.println("\nWe hate to see you Poly-Go!");
                    break outerLoop;
            }
        }
    }

    public static int choosePolygon(Scanner input, ArrayList<Polygon> polygons) {
        String[] choices = new String[polygons.size()];
        for (int i = 0; i < polygons.size(); i++) {
            choices[i] = polygons.get(i).getType();
        }
        return getChoice(input, "Available polygons:", choices);
    }
        
    public static void displayPolygon(Polygon polygon) {
        System.out.printf("%nThe area of this %s is %.3f and its perimeter is %.3f.%n", polygon.getType(), polygon.area(), polygon.perimeter());
    }

    public static int getChoice(Scanner input, String message, String[] choices) {
        while (true) {
            System.out.println("\n" + message);
            displayChoices(choices);
            try {
                int choice = input.nextInt();
                if (choice < 1 || choices.length < choice) {
                    System.out.println("\n" + choice + " is out of range.");
                } else {
                    return choice;
                }
            } catch (InputMismatchException e) {
                String bad = input.nextLine();
                System.out.println("\n" + bad + " is not an integer.");
            }
        }
    }

    public static void displayChoices(String[] choices) {
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ") " + choices[i]);
        }
    }

    public static double getSide(Scanner input, String message) {
        while (true) {
            System.out.println("\n" + message);
            try {
                double choice = input.nextDouble();
                if (choice < 0) {
                    System.out.println("\nI'm sorry, I cannot work with negative dimensions.");
                }
                else if (choice == 0) {
                    System.out.println("\nI'm sorry, I cannot work with a length of 0.");
                }
                else {
                    return choice;
                }
            } catch (InputMismatchException e) {
                String bad = input.nextLine();
                System.out.println("\n" + bad + " is not a number.");
            }
        }
    }

    public static ArrayList<Double> getSides(Scanner input, String[] variables, String type) {
        ArrayList<Double> sides = new ArrayList<Double>();
        for (int i = 0; i < variables.length; i++) {
            sides.add(getSide(input, "What is the " + variables[i] + " of the " + type));
        }
        return sides;
    }
    

    public static void addPolygon(ArrayList<Polygon> polygons, Polygon polygon) {
        displayPolygon(polygon);
        polygons.add(polygon);
    }
}
