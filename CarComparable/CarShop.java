import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CarShop {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();

        try (Scanner input = new Scanner(new File("cars.csv"));) {
            input.nextLine();
            while (input.hasNextLine()) {
                String[] row = input.nextLine().split(",");
                String carName = row[0];
                String carType = row[1];
                int carHP = Integer.parseInt(row[8]);
                Car c = new Car(carName, carType, carHP);
                cars.add(c);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        }

        Collections.sort(cars, Comparator.reverseOrder());
        for (Car c : cars) {
            System.out.println(c);
        }
    }
}
