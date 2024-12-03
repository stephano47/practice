package workbook2.TheatereReservations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TheatreReservations {
    public static void main(String []args){
        // goals: user will be able to enter name, day that they will arrive to movie theatre, and how many tickets will be applied (if statement can be used)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Movie Theatre Application!");
        System.out.println("Please enter your Full Name"); // must split between spaces to make sure last name is displayed before first name in when all user info is collected
        String userName = scanner.nextLine(); // an array can be for first and last name
        String[] fullName = userName.split(" "); // this allows me to get the first and last name as different variables
        String firstName = fullName[0];
        String lastName = fullName[1];

        System.out.println("Please enter the day you will attend the Movie Theatre\n" + "When entering please use (MM/DD/YYYY)");
        DateTimeFormatter formatter;
        String date = scanner.nextLine();
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // need a better understanding on .ofPattern()

        LocalDate finalDate = LocalDate.parse(date, formatter); // as of right now LocalDate will only accept YYYY-MM-DD

        System.out.println("How many tickets would you like to buy?");
        int tickets = scanner.nextInt();


        // tickets if statements
        if (tickets > 1){
            System.out.println(tickets + " tickets reserved for the movie on " + finalDate + " for " + lastName +", " + firstName);
        } else if (tickets == 1 ) {
            System.out.println(tickets + " ticket reserved for the movie on " + finalDate + " for " + lastName +", " + firstName);
        } else if (tickets <= 0) {
            System.out.println("No tickets where bought."); // when printing it does not use MM/DD/YYYY format, why?
        }


    }
}
