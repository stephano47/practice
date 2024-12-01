package workbook1.financialcalculators;

import java.util.*;

public class futureValue {
    public static void main(String []args) {
        // Start - Deposit Amount Request
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Future Value Application App!");
        System.out.println("This Application will help you know how much a deposit will be worth as time passes!");
        System.out.println("To start please enter how much the deposit is");
        double deposit = scanner.nextDouble();
        scanner.nextLine();
        // Interest Request
        System.out.println("What is the interest rate on said deposit?");
        double interestRate = scanner.nextDouble();
        // CD (Certificate of Deposit) Length Request
        System.out.println("Finally what is the length of your CD Deposit?\n" + "Note do not type in decimals.\n" +"Example: if your CD last for 1.5 years type 18.");
        int cdLength = scanner.nextInt();

        double monthlyInterestRate = (interestRate / 100) / 12;
        double futureValue = deposit * Math.pow(1 + monthlyInterestRate, cdLength);
        double interestDifference = futureValue - deposit;

        System.out.println("\nHere is your CD Length Term Information!\n------------------------------");
        System.out.printf("Future Value of the Deposit: $%.2f%n", futureValue); // Future value formatted to two decimal places
        System.out.printf("Total Interest Earned: $%.2f%n", interestDifference);


    }
}
