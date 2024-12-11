package workbook2.VehicleInventory;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();
        do{
            System.out.println("What do you want to do?\n" + "---------------------------------------------");
            System.out.println("1 - List All Vehicles\n"+ "2 - Search by make/model\n" + "3 - Search by price range\n"+"4 - Search by color\n"+"5 - Add a vehicle\n"+"6- Quit");
            int userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    System.out.println("1");
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
