package workbook1.rentalCarCalculator;

import java.util.Scanner;

public class rentalCarCalculator {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        //--  start of program
        //-- pickup date request
        System.out.println("Welcome to the Car Rental!\n" + "What date would your like to pickup your car?\n" + "Please enter the date you would like in this format MM/DD/YYY");
        String pickupDate = scanner.nextLine();

        // -- find amount of days for rental of car
        System.out.println("How many days would you need the car?\n"+"Note: The daily rent of our cars are $29.99 a day");
        int days = scanner.nextInt();
        scanner.nextLine();

        // -- request for electronic toll tag
        System.out.println("Would you like an electronic toll tag during your rental?\n" + "Note: Additional fees will apply\n" + "- Yes\n" + "- No");
        String tollOption = scanner.nextLine();
          boolean tollTag = true;
        if (tollOption.equalsIgnoreCase("Yes")){
            tollTag = true;
        } else if (tollOption.equalsIgnoreCase("No")) {
            tollTag = false;
        }
        // -- gps request
        System.out.println("Would you like a GPS during your rental\n"+"- Yes\n"+"- No");
        String gpsOption = scanner.nextLine();
          boolean gps =true;
        if (gpsOption.equalsIgnoreCase("Yes")){
            gps = true;
        } else if (gpsOption.equalsIgnoreCase("No")) {
            gps = false;
        }
        // road side assistance request
        System.out.println("Would you like Road-Side Assistance?\n"+"- Yes\n" + "- No");
        String roadOption = scanner.nextLine();
         boolean roadSideAssist = true;

        if (roadOption.equalsIgnoreCase("Yes")){
            roadSideAssist = true;
        } else if (roadOption.equalsIgnoreCase("No")) {
            roadSideAssist = false;
        }

        // current age
        System.out.println("How old are you?" + " Note: There is a surcharge fee if you are under 25 years old");
        int age = scanner.nextInt();
        // display all info
        double basicCarRental = 29.99;
        double tollTagPrice = 3.95;
        double gpsPrice = 2.95;
        double roadsidePrice = 3.95;
        if (age >= 25 && !tollTag && !gps && !roadSideAssist){
            // this will be a scenario if user is 25 and up and chooses no optional costs
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: "+ pickupDate);
            System.out.println("Days of Rental: "+ days);
            System.out.println("Current Age: "+ age);// will have to put into if statements for specific outcomes
            System.out.println("Daily Car Rental:" + "$"+basicCarRental);
            System.out.println("Optional Costs: N/A");
            System.out.println("Underage Driver Surcharge N/A");
            System.out.println("Total: $" + String.format("%.2f", days * basicCarRental));
        } else if (age < 25 && !tollTag && !gps && !roadSideAssist) {
            // this will be a scenario if user is 25 and below and chooses no optional costs
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: "+ pickupDate);
            System.out.println("Days of Rental: "+ days);
            System.out.println("Current Age: "+ age);// will have to put into if statements for specific outcomes
            System.out.println("Daily Car Rental:" + "$"+basicCarRental);
            System.out.println("Optional Costs: N/A");
            System.out.println("Underage Driver Surcharge: Applied");
            System.out.println("Total: $" + String.format("%.2f", days * basicCarRental * 1.3));
        }// if user wants toll tag
        else if (age >= 25 && tollTag && !gps && !roadSideAssist) {
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: "+ pickupDate);
            System.out.println("Days of Rental: "+ days);
            System.out.println("Current Age: "+ age);// will have to put into if statements for specific outcomes
            System.out.println("Daily Car Rental:" + "$"+basicCarRental);
            System.out.println("Optional Costs: Toll Tag: $" + tollTagPrice + " Per Day");
            System.out.println("Underage Driver Surcharge: N/A");
            System.out.println("Total: $" + String.format("%.2f", days * basicCarRental * tollTagPrice));
        } else if (age < 25 && tollTag && !gps && !roadSideAssist) {
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: "+ pickupDate);
            System.out.println("Days of Rental: "+ days);
            System.out.println("Current Age: "+ age);// will have to put into if statements for specific outcomes
            System.out.println("Daily Car Rental:" + "$"+basicCarRental);
            System.out.println("Optional Costs: N/A");
            System.out.println("Underage Driver Surcharge: Applied");
            System.out.println("Total: $" + String.format("%.2f", days * basicCarRental * tollTagPrice * 1.3));
        // easier to read
        }else if (age >= 25 && tollTag && gps && !roadSideAssist){
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: "+ pickupDate);
            System.out.println("Days of Rental: "+ days);
            System.out.println("Current Age: "+ age);// will have to put into if statements for specific outcomes
            System.out.println("Daily Car Rental:" + "$"+basicCarRental);
            System.out.println("Optional Costs: Toll Tag:"+ "$"+tollTagPrice+" per day \n"+"GPS: $"+ gpsPrice+" per day");
            System.out.println("Underage Driver Surcharge: N/A");
            System.out.println("Total: $" + String.format("%.2f", days * basicCarRental * tollTagPrice ));
        }else if (age < 25 && tollTag && gps && !roadSideAssist){
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: "+ pickupDate);
            System.out.println("Days of Rental: "+ days);
            System.out.println("Current Age: "+ age);// will have to put into if statements for specific outcomes
            System.out.println("Daily Car Rental:" + "$"+basicCarRental);
            System.out.println("Optional Costs: Toll Tag:"+ "$"+tollTagPrice+" per day \n"+"GPS: $"+ gpsPrice+" per day");
            System.out.println("Underage Driver Surcharge: Applied");
            System.out.println("Total: $" + String.format("%.2f", days * basicCarRental * tollTagPrice * 1.3));
        }// If age >= 25 and only Road Side Assistance is selected
        else if (age >= 25 && !tollTag && !gps && roadSideAssist) {
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: " + pickupDate);
            System.out.println("Days of Rental: " + days);
            System.out.println("Current Age: " + age);
            System.out.println("Daily Car Rental: $" + basicCarRental);
            System.out.println("Optional Costs: Road Side Assistance: $" + roadsidePrice + " per day");
            System.out.println("Underage Driver Surcharge: N/A");
            System.out.println("Total: $" + String.format("%.2f", days * (basicCarRental + roadsidePrice)));
        }

// If age < 25 and only Road Side Assistance is selected
        else if (age < 25 && !tollTag && !gps && roadSideAssist) {
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: " + pickupDate);
            System.out.println("Days of Rental: " + days);
            System.out.println("Current Age: " + age);
            System.out.println("Daily Car Rental: $" + basicCarRental);
            System.out.println("Optional Costs: Road Side Assistance: $" + roadsidePrice + " per day");
            System.out.println("Underage Driver Surcharge: Applied");
            System.out.println("Total: $" + String.format("%.2f", days * (basicCarRental + roadsidePrice) * 1.3));
        }

// If age >= 25 and selects all options (Toll Tag, GPS, and Road Side Assistance)
        else if (age >= 25 && tollTag && gps && roadSideAssist) {
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: " + pickupDate);
            System.out.println("Days of Rental: " + days);
            System.out.println("Current Age: " + age);
            System.out.println("Daily Car Rental: $" + basicCarRental);
            System.out.println("Optional Costs: ");
            System.out.println(" - Toll Tag: $" + tollTagPrice + " per day");
            System.out.println(" - GPS: $" + gpsPrice + " per day");
            System.out.println(" - Road Side Assistance: $" + roadsidePrice + " per day");
            System.out.println("Underage Driver Surcharge: N/A");
            System.out.println("Total: $" + String.format("%.2f", days * (basicCarRental + tollTagPrice + gpsPrice + roadsidePrice)));
        }

// If age < 25 and selects all options (Toll Tag, GPS, and Road Side Assistance)
        else if (age < 25 && tollTag && gps && roadSideAssist) {
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: " + pickupDate);
            System.out.println("Days of Rental: " + days);
            System.out.println("Current Age: " + age);
            System.out.println("Daily Car Rental: $" + basicCarRental);
            System.out.println("Optional Costs: ");
            System.out.println(" - Toll Tag: $" + tollTagPrice + " per day");
            System.out.println(" - GPS: $" + gpsPrice + " per day");
            System.out.println(" - Road Side Assistance: $" + roadsidePrice + " per day");
            System.out.println("Underage Driver Surcharge: Applied");
            System.out.println("Total: $" + String.format("%.2f", days * (basicCarRental + tollTagPrice + gpsPrice + roadsidePrice) * 1.3));
        }

// If age >= 25 and selects GPS and Road Side Assistance (No Toll Tag)
        else if (age >= 25 && !tollTag && gps && roadSideAssist) {
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: " + pickupDate);
            System.out.println("Days of Rental: " + days);
            System.out.println("Current Age: " + age);
            System.out.println("Daily Car Rental: $" + basicCarRental);
            System.out.println("Optional Costs: ");
            System.out.println(" - GPS: $" + gpsPrice + " per day");
            System.out.println(" - Road Side Assistance: $" + roadsidePrice + " per day");
            System.out.println("Underage Driver Surcharge: N/A");
            System.out.println("Total: $" + String.format("%.2f", days * (basicCarRental + gpsPrice + roadsidePrice)));
        }

// If age < 25 and selects GPS and Road Side Assistance (No Toll Tag)
        else if (age < 25 && !tollTag && gps && roadSideAssist) {
            System.out.println("Here is your overview of your planned rental!");
            System.out.println("------------------------------------------------");
            System.out.println("Pickup Date: " + pickupDate);
            System.out.println("Days of Rental: " + days);
            System.out.println("Current Age: " + age);
            System.out.println("Daily Car Rental: $" + basicCarRental);
            System.out.println("Optional Costs: ");
            System.out.println(" - GPS: $" + gpsPrice + " per day");
            System.out.println(" - Road Side Assistance: $" + roadsidePrice + " per day");
            System.out.println("Underage Driver Surcharge: Applied");
            System.out.println("Total: $" + String.format("%.2f", days * (basicCarRental + gpsPrice + roadsidePrice) * 1.3));
        }



    }


    }



