package workbook2.VehicleInventory;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws InterruptedException {
        Vehicle[] vehicles = new Vehicle[20];
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red",45000,13500);
        vehicles[1] = new Vehicle(101121, "Toyota Camry", "Blue",50000,9700);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu","Black",50000,9700);
        vehicles[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicles[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicles [5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

        int vehicleCount =6;



        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("What do you want to do?\n" +
                    "---------------------------------------------");
            System.out.println("1 - List All Vehicles\n"+
                    "2 - Search by make/model\n" +
                    "3 - Search by price range\n"+
                    "4 - Search by color\n"+
                    "5 - Add a vehicle\n"+
                    "6- Quit");
            int userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput){
                case 1:
                    for (int i=0; i < vehicleCount; i++) {
                        System.out.println(vehicles[i].displayDetails());
                    }
                    break;
                case 2:
                    System.out.println("Enter make/model to search:");
                    String makeModel = scanner.nextLine();
                    System.out.println("Search results:");
                    for (int i = 0; i < vehicleCount; i++) {
                        if (vehicles[i].getMakeModel().equalsIgnoreCase(makeModel)) {
                            System.out.println(vehicles[i].displayDetails()); // using this to call the same case from  the vehicle class
                            // improves readability and reduces line usage
                        }
                    }

                    break;
                case 3:
                    System.out.println("Enter minimum price:");
                    int minPrice = scanner.nextInt();
                    System.out.println("Enter maximum price:");
                    int maxPrice = scanner.nextInt();
                    System.out.println("Search results:");
                    for (int i = 0; i < vehicleCount; i++) {
                        if (vehicles[i].getPrice() >= minPrice && vehicles[i].getPrice() <= maxPrice) {
                            System.out.println(vehicles[i].displayDetails());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter color to search:");
                    String color = scanner.nextLine();
                    System.out.println("Search results:");
                    for (int i = 0; i < vehicleCount; i++) {
                        if (vehicles[i].getColor().equalsIgnoreCase(color)) {
                            System.out.println(vehicles[i].displayDetails());
                        }
                    }
                    break;
                case 5:
                    if (vehicleCount < vehicles.length) {
                        vehicles[vehicleCount++] = Vehicle.addVehicles();
                        System.out.println("Vehicle added successfully!");
                    } else {
                        System.out.println("Inventory is full. Cannot add more vehicles.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    Thread.sleep(1000);
                    System.exit(0);

            }
        }while (true);


    }

    }

