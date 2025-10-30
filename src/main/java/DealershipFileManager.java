import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DealershipFileManager {
    String filePath = "src/main/resources/inventory";
    Scanner scanner = new Scanner(System.in);

    // Constructor with filePath in the parameters
    public DealershipFileManager(String filePath) {
        Dealership dealership;

        try {
            // BufferedReader named reader
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String header = reader.readLine();
            String[] headerParts = header.split("\\|");
            dealership = new Dealership(headerParts[0], headerParts[1], headerParts[2]);

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length == 8) {
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);

                    Vehicle v = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    dealership.addVehicle(v);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveDealership(Dealership dealership){

    }
}
