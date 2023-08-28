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

        int choice = getChoice(input, "Do you want to", new String {"Create a new polygon", "Display polygons", "Quit"});
        switch (choice) {
            case 1:
                choice = getChoice(input, "What type of polygon is it?", new String{"Triangle", "Rectangle", "Pentagon", "Hexagon", "Octagon"});
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                    case 4:
                    case 5:
                        break;
                break;
            case 2:
                choice = choosePolygon(input, polygons);
                
                break;
            case 3:
                System.out.println("We hate to see you Poly-Go!");
                break;
        }
    }

    public static int choosePolygon(Scanner input, ArrayList<Polygon> polygons) {
        // System.out.println("Available polygons");
        // for (int i = 0; i < polygons.size(); i++) {
        //     System.out.println((i + 1) + ") " + polygons.get(i).getType());
        // }
        String[] choices = new String[polygons.size()];
        for (int i = 0; i < polygons.size(); i++) {
            choices[i] = polygons.get(i);
        }
        return getChoice(input, "Available polygons", choices);
    }
        
    public static void displayPolygon(ArrayList<Polygon> polygons, int choice) {
        Polygon polygon = polygons.get(choice);
        
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
        
}
