package workbook1.financialcalculators;
import java.util.*;
public class mortgageCalculator {
// Definitions for mortgage calculator
    // Principal - Initial Loan Amount
    // Interest -  the amount you have to pay for borrowing the higher the rate the more you pay
    // Loan Length - Time it takes to repay mortgage in full
public static void main(String []args){
    // Start - Loan Amount Request
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the Mortgage Calculator App!");
    System.out.println("This Application will help you find out how much would you have to pay per month to pay off your rent!");
    System.out.println("To start please enter how much you received from the Loan");
    int initialLoan = scanner.nextInt();
    scanner.nextLine();
    // Interest Request
    System.out.println("What is the interest rate on your loan?");
    double interestRate = scanner.nextDouble();
    // Loan Length Request
    System.out.println("Finally how many years do you have to pay your loan?");
    int loanLength = scanner.nextInt();

    // Convert annual interest rate to monthly rate
    double monthlyInterestRate = (interestRate / 100) / 12;

    // Calculate the total number of payments (in months)
    int totalMonths = loanLength * 12;

    // Calculate monthly payment using the mortgage formula
    double monthlyPayment = (initialLoan * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalMonths)) /
            (Math.pow(1 + monthlyInterestRate, totalMonths) - 1);

    // Calculate total payment
    double totalPayment = monthlyPayment * totalMonths;

    // Calculate total interest paid
    double totalInterestPaid = totalPayment - initialLoan;

    // Display the results
    System.out.println("Display Calculations\n" + "------------------------------");
    System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
    System.out.printf("Total Interest Paid: $%.2f%n", totalInterestPaid);



}



}
