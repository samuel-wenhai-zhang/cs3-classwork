import java.util.*;
import java.io.*;

public class PolygonFactory {
    public static void main(String[] args) throws IOException {
        System.out.println("**********************************************************\n");
        System.out.println("Welcome to the Polygon Factory!\n");
        System.out.println("**********************************************************\n");

        // your code here
        Scanner input = new Scanner(System.in);
        ArrayList<Polygon> polygons = new ArrayList<Polygon>();
        int choice;
        outerLoop:
        while (true) {
            choice = getChoice(input, "Do you want to", new String[] {"Create a new polygon", "Display polygons", "Quit"});
            switch (choice) {
                case 1:
                    ArrayList<Double> sides = new ArrayList<Double>();
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
                                    sides = getSides(input, new String[] {"side"}, "equilateral triangle");
                                    addPolygon(polygons, new EquilateralTriangle(sides.get(0)));
                                    break;
                                case 3:
                                    sides = getSides(input, new String[] {"1st side", "2nd side", "3rd side"}, "triangle");
                                    addPolygon(polygons, new Triangle(sides.get(0), sides.get(1), sides.get(2)));
                                    break;
                            }
                            break;
                        case 2:
                            addPolygon(polygons, new Rectangle(getSide(input, "What is the "),
                                                                getSide(input,"Stuff" )));
                            break;
                        case 3:
                        case 4:
                        case 5:
                            break;
                    }
                    break;
                case 2:
                    choice = choosePolygon(input, polygons);
                    displayPolygon(polygons.get(choice));
                    break;
                case 3:
                    System.out.println("We hate to see you Poly-Go!");
                    break outerLoop;
            }
        }   
    }

    public static int choosePolygon(Scanner input, ArrayList<Polygon> polygons) {
        String[] choices = new String[polygons.size()];
        for (int i = 0; i < polygons.size(); i++) {
            choices[i] = polygons.get(i).getType();
        }
        return getChoice(input, "Available polygons", choices);
    }
        
    public static void displayPolygon(Polygon polygon) {
        System.out.printf("The area of this %s is %.3f and its perimeter is %.3f.%n", polygon.getType(), polygon.area(), polygon.perimeter());
    }

    public static int getChoice(Scanner input, String message, String[] choices) {
        while (true) {
            try {
                System.out.println(message);
                displayChoices(choices);
                int choice = input.nextInt();
                if (choice < 1 || choices.length < choice) {
                    System.out.println(choice + " is out of range.");
                } else {
                    return choice;
                }
            } catch (InputMismatchException e) {
                String bad = input.nextLine();
                System.out.println(bad + " is not an integer.");
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
            try {
                System.out.println(message);
                double choice = input.nextDouble();
                if (choice < 0) {
                    System.out.println("I'm sorry, I cannot work with negative dimensions.");
                } else {
                    return choice;
                }
            } catch (InputMismatchException e) {
                String bad = input.nextLine();
                System.out.println(bad + " is not a number.");
            }
        }
    }

    public static ArrayList<Double> getSides(Scanner input, String[] variables, String type) {
        ArrayList<Double> sides = new ArrayList<Double>();
        for (int i = 0; i < variables.length; i++) {
            sides.add(getSide(input, "What is the " + variables[i] + " length of the " + type));
        }
        return sides;
    }
    

    public static void addPolygon(ArrayList<Polygon> polygons, Polygon polygon) {
        displayPolygon(polygon);
        polygons.add(polygon);
    }
}
