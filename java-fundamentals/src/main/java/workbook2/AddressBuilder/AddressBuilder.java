package workbook2.AddressBuilder;
import java.util.*;
public class AddressBuilder {
    public static void main(String[] args){
        StringBuilder customerInfo = new StringBuilder(); // string builder is meant to hold all addresses info
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name"); // would I be able to just say append this user input variable?
        String userName = scanner.nextLine();
        // billing address request
        System.out.println("Billing Address\n"+"------------------------\n"+"Please enter your Billing Street Address");
        String billStreet = scanner.nextLine();
        customerInfo.append(billStreet); // I can append using the user input variables
        System.out.println("Please enter your Billing City");
        String billCity = scanner.nextLine();
        customerInfo.append(billCity);
        System.out.println("Please enter your Billing State");
        String billState = scanner.nextLine();
        customerInfo.append(billState);
        System.out.println("Please enter your Billing Zip Code");
        String billZip = scanner.nextLine();
        customerInfo.append(billZip);



        String fullAddress = customerInfo.toString();
        System.out.println(customerInfo);

        /*
         Testing: Outputted this 107 Ivy GroveFloral BoulevardTexas109773

         */
    }
}
