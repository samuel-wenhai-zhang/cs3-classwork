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
        do {
            System.out.println("Do you want to\n1) Create a new polygon\n2) Display polygons\n3) Quit");
            choice = getChoice(input);
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("What type of polygon is it?\n1) Triangle\n2) Rectangle\n3) Pentagon\n4) Hexagon\n5) Octagon");
                    choice = getChoice(input);
                    System.out.println();
                    
                    switch (choice) {
                        case 1:
                            System.out.println("What type of triangle is it?\n1) Isosceles\n2) Equilateral\n3) Neither of these");
                            choice = getChoice(input);
                            System.out.println();

                            switch (choice) {
                                case 1:
                                    
                                    break;
                                case 2:
                                    System.out.println("What is the side length of the triangle?");
                                    EquilateralTriangle et = new EquilateralTriangle(getSide(input);
                                    System.out.println("The area of this + " et.getType() + " is " + area() + " and its perimeter is " + et.perimeter() + ".");
                                    polygons.add(et);
                                    break;
                                case 3:
                                    break;
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 2:
                    for (int i = 0; i < polygons.size(); i++) {
                        System.out.println((i+1) + ") " + polygons.get(i).getType());
                    }
                    break;
            }

        } while (choice != 3);
        System.out.println("We hate to see you Poly-Go!");
    }


    public static int getChoice(Scanner input) {
        try {
            int choice = input.nextInt();
            if (choice < 0) {
                System.out.println("I'm sorry, I cannot work with negative dimensions.");
                return -1;
            }
            return choice;
        }
        catch (Exception e) {
            System.out.println("Invalid input: Must be a number.");
            return -1;
        }
    }

    public static double getSide(Scanner input) {
        try {
            double choice = input.nextDouble();
            if (choice < 0) {
                System.out.println("I'm sorry, I cannot work with negative dimensions.");
                return -1;
            }
            return choice;
        }
        catch (Exception e) {
            System.out.println("Invalid input: Must be a number.");
            return -1;
        }
    }
}
