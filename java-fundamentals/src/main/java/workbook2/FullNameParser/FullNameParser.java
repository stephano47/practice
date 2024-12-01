package workbook2.FullNameParser;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String []args){
        String fullname = PromptForString("Please Enter Your Full Name");
        int indexOfFirstSpace = fullname.indexOf(' ');
        String firstName = fullname.substring(0, indexOfFirstSpace);

        String endingpart = fullname.substring(indexOfFirstSpace + 1);

        String middleName;
        String lastName;
        // looks for space in the ending portion of full name
        int indexOfSpaceInEndingPart = endingpart.indexOf(" ");

        if (indexOfSpaceInEndingPart < 0) {
            //if returns as a negative there is no middle name
            // or if one space is used after first name it indicates there is only a last name
            middleName = "";
            lastName = endingpart;
        } else {
            // If there are 2 spaces after first name it will use this if statement
            middleName = endingpart.substring(0, indexOfSpaceInEndingPart);

            lastName = endingpart.substring(indexOfSpaceInEndingPart + 1);
        }


        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }

    public static String PromptForString(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
