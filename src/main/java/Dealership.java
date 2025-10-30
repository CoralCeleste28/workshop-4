import java.util.ArrayList;
import java.util.List;

public class Dealership {
    String name;
    String address;
    String phoneNumber;
    ArrayList<Vehicle> inventory;

    // Overloaded Constructor
    public Dealership(String name, String address,String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        // Initials the array list
        this.inventory = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        inventory.add(v);
    }

    public void getAllVehicles(List<Vehicle> inventory){
    for (Vehicle v : inventory){
        System.out.println(v.getMake());
        System.out.printf(""" 
                       VIN: %d
                       Year: %d
                       Make: %s
                       Model: %s
                       Vehicle Type: %s
                       Color: %s
                       Odometer: %d
                       Price: $%.2f
                       """, v.getVin(), v.getYear(), v.getMake(), v.getModel(), v.getVehicleType(), v.getColor(), v.getOdometer(), v.getPrice());
    }

    }

//    public void removeVehicle(Vehicle v){
//        inventory.add(v);
//    }



    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
