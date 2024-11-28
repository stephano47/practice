package workbook1.sandwichShop;

import java.util.Scanner;

public class sandwichShop {
    /* goals: user has the ability to make a sandwich either regular or large
    if the user is 17 and under or 65 and older a discount will be applied*/
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        // start and sandwich size option --
        System.out.println("Welcome to the Sandwich Shop!");
        System.out.println("_______________________________");
        System.out.println("What size would you like your Sandwich?\n" + "- Regular\n" + "- Large");
        String sizeChoice = scanner.nextLine();
        // age option --
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        // display price
        double regSandwich = 5.45;
        double lrgSandwich = 8.95;
         // if statements for scenarios
        if(age <= 17 && sizeChoice.equalsIgnoreCase("Regular")){
            System.out.println("Here is your price!");
            System.out.println(regSandwich * 0.9); // if user is 17 and below with regular sandwich
            System.out.println("Thank you for your purchase!");
        } else if (age <= 17 && sizeChoice.equalsIgnoreCase("Large")) {
            System.out.println("Here is your price!");
            System.out.println(lrgSandwich * 0.9); // if user is 17 and below with large sandwich
            System.out.println("Thank you for your purchase!");
        } else if (age >= 65 && sizeChoice.equalsIgnoreCase("Regular")) {
            System.out.println("Here is your price!");
            System.out.println(regSandwich * 0.8); // if user is 65 and below with regular sandwich
            System.out.println("Thank you for your purchase!");
        } else if (age >= 65 && sizeChoice.equalsIgnoreCase("Large") ) {
            System.out.println("Here is your price!");
            System.out.println(lrgSandwich * 0.8); // if user is 65 and below with large sandwich
            System.out.println("Thank you for your purchase!");
        }else if(sizeChoice.equalsIgnoreCase("Regular")){
            System.out.println("Here is your price!");
            System.out.println(regSandwich); // if user chooses regular sandwich and is not in discount range
            System.out.println("Thank you for your purchase!");
        } else if (sizeChoice.equalsIgnoreCase("Large")) {
            System.out.println("Here is your price!");
            System.out.println(lrgSandwich); // if user chooses large sandwich and is not in discount range
            System.out.println("Thank you for your purchase!");
        }


    }
}
