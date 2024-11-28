package workbook1.basicCalculator;

import java.util.Scanner;

public class calculatorApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // goal basic calculator that can add, divide, multiply, and subtract
        System.out.println("Please choose your first number:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter your second number");
        int num2 = scanner.nextInt();
        scanner.nextLine(); //<-- Without this the user would not be able to enter the calculation they would want
        // calculation options
        System.out.println("How would you like to calculate these two numbers? (Please type the letter indicating your choice of calculation" +
                "\n"+"(A)dd\n"+"(S)ubtract\n"+"(D)ivide\n"+"(M)ultiply");
        String calcChoice = scanner.nextLine();

        if (calcChoice.equalsIgnoreCase("A")){
            System.out.println(num1 + num2);
        } else if (calcChoice.equalsIgnoreCase("S")) {
            System.out.println(num1 - num2);
        } else if (calcChoice.equalsIgnoreCase("D")) {
            if (num2 == 0){
                System.out.println("ERROR: Cannot divide by 0");
            }
        }System.out.println(num1/num2);


    }
}
