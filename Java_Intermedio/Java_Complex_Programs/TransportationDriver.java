package Java_Complex_Programs;
import Java_Complex_Programs.TransportBike;
import Java_Complex_Programs.TransportCar;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TransportationDriver {
    public static void main(String[] args) {
        if (args.length > 0) {
            String fileName = args[0];
            File file = new File(fileName);
            try {
                Scanner input = new Scanner(file);
                String person1 = input.next();
                String person2 = input.next();

                TransportBike harley = new TransportBike();
                TransportCar toyota = new TransportCar();

                harley.wheels();
                toyota.wheels();

                System.out.println(person1 + " and " + person2 + " want to purchase a bike.");
                System.out.println(person2 + " wants to purchase a car.");

                input.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + fileName);
            }
        } else {
            System.out.println("No file name provided.");
        }
    }
}
