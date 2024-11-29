package workbook1.rentalCarCalculator;

import java.util.Scanner;

public class rentalCarCalculator {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        //--  start of program
        //-- pickup date request
        System.out.println("Welcome to the Car Rental!\n" + "What date would your like to pickup your car?");
        String pickupDate = scanner.nextLine();

        // -- find amount of days for rental of car
        System.out.println("How many days would you need the car?");
        int days = scanner.nextInt();
        scanner.nextLine();

        // request for electronic toll tag
        System.out.println("Would you like an electronic toll tag during your rental?\n" + "Note: Additional fees will apply\n" + "- Yes\n" + "- No");
        String tollOption = scanner.nextLine();
          boolean tollTag;
        if (tollOption.equalsIgnoreCase("Yes")){
            tollTag = true;
            System.out.println(tollTag);
        } else if (tollOption.equalsIgnoreCase("No")) {
            tollTag = false;
            System.out.println(tollTag);
        }
    }
}
