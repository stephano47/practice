package workbook2.TheatereReservations;

import java.util.*;

public class TheatreReservations {
    public static void main(String []args){
        // goals: user will be able to enter name, day that they will arrive to movie theatre, and how many tickets will be applied (if statement can be used)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Movie Theatre Application!");
        System.out.println("Please enter your Full Name"); // must split between spaces to make sure last name is displayed before first name in when all user info is collected
        String fullName = scanner.nextLine();

        System.out.println("Please enter the day you will attend the Movie Theatre");
        String date = scanner.nextLine();

        System.out.println("How many tickets would you like to buy?");
        int tickets = scanner.nextInt();


        // tickets if statements
        if (tickets > 1){
            System.out.println(fullName+ " is buying " + tickets + " tickets for the movie showing on " + date );
        } else if (tickets == 1 ) {
            System.out.println(fullName+ " is buying " + tickets + " ticket for the movie showing on " + date );
        } else if (tickets < 0) {
            System.out.println("No tickets where bought.");
        }


    }
}
