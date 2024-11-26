package workbook1;

import java.util.Scanner;

public class Salary {
    // goal find highest salary using max in the math method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //double bobSalary = 7000.00; // math max without scanner method
        //double garySalary =6500.00;
       // System.out.println("The highest salary is "+Math.max(bobSalary,garySalary));

        System.out.println("Please enter your salary Bob");
        double bobSalary = scanner.nextDouble();
        System.out.println("Please enter your salary Gary");
        double garySalary = scanner.nextDouble();

        double highestSalary = Math.max(bobSalary,garySalary);
        if (bobSalary > garySalary){
            System.out.println("Bob has the highest salary: "+ highestSalary);
        } else if (bobSalary < garySalary) {
            System.out.println("Gary has the highest salary "+highestSalary);
        } else if (bobSalary == garySalary) {
            System.out.println("Both of your salaries are the same");
        }

    }
}
