package workbook2.VehicleInventory;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
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

            switch (userInput){
                case 1:
                    for (int i=0; i < vehicleCount; i++) {
                        System.out.println("Vehicle ID: "+vehicles[i].getVehicleID()+
                                " Make and Model: "+vehicles[i].getMakeModel()+
                                " Color: " + vehicles[i].getColor()+
                                " Odometer: " + vehicles[i].getOdometer()+
                                " Price: " + vehicles[i].getPrice());
                    }
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.exit(0);
            }
        }while (true);


    }

    }

