package workbook2.VehicleInventory;
import java.util.*;
public class Vehicle {
    private long vehicleID;
    private String makeModel;
    private String color;
    private int odometer;
    private float price;

    public Vehicle(long vehicleID, String makeModel, String color, int odometer, float price){
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public long  getVehicleID() {return vehicleID;}

    public void setVehicleID(long vehicleID) {this.vehicleID = vehicleID;}

    public String getMakeModel() {return makeModel;}

    public void setMakeModel(String makeModel) {this.makeModel = makeModel;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public int getOdometer() {return odometer;}

    public void setOdometer(int odometer) {this.odometer = odometer;}

    public float getPrice() {return price;}

    public void setPrice(float price) {this.price = price;}

    public String displayDetails() {
        return "Vehicle ID: " + vehicleID +
                ", Make/Model: " + makeModel +
                ", Color: " + color +
                ", Odometer: " + odometer +
                ", Price: $" + price;
    }
    public static Vehicle addVehicles(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter the make and model of the vehicle:");
        String makeModel = scanner.nextLine();
        System.out.println("Enter the color of the vehicle:");
        String color = scanner.nextLine();
        System.out.println("Enter odometer:");
        int odometer = scanner.nextInt();
        System.out.println("Enter the price:");
        int price = scanner.nextInt();

        return new Vehicle(id, makeModel, color, odometer, price);
    }
}
