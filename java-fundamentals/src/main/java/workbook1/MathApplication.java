package workbook1;

import java.util.Scanner;

public class MathApplication {
    public static void main(String[] args){
        // Goal: simple math application only with addition
        // Use Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter your second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Your total is " + sum);
    }
}
