package workbook1;

import java.util.Scanner;

public class payrollCalculator {
    // Goal create payroll app allowing user to enter name, hours worked, and will display their gross pay.
    // all numerical values must be floats

    public static void main(String []args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Request Name
        System.out.println("Welcome to the Payroll Calculator App!\n" + "Please enter your First name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your Last Name: ");
        String lastName = scanner.nextLine();

        // Display full name and ask for hours worked
        String fullName = (firstName + " " + lastName); // using "" allows spaces remember this to make a variable of others used early in start of program
        System.out.println("Hello " +  fullName + "!\n" + "How many hours did you work this week?");
        float hoursWorked = scanner.nextFloat();

        System.out.println("You worked " + hoursWorked+ " Hours\n" + "What is your hourly pay rate?");
        float payRate = scanner.nextFloat();

        // usage of if and else statements to get proper calculations

        if (payRate <= 40){
            float grossPay = payRate * hoursWorked;
            System.out.println("Loading information...");
            Thread.sleep(1200);
            System.out.println("Thank You For Your Patience Your Payroll Information is Ready!" );
            System.out.println( "----------------------------------------------------------------------");
            System.out.println("Name: " + fullName);
            System.out.println("Total Hours Worked: " + hoursWorked);
            System.out.println("Total Pay: " + grossPay);
        }





    }
}
