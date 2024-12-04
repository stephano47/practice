package workbook2.AddressBuilder;
import java.util.*;
public class AddressBuilder {
    public static void main(String[] args){
        StringBuilder customerInfo = new StringBuilder(); // string builder is meant to hold all addresses info
        Scanner scanner = new Scanner(System.in);
        StringBuilder shippingInfo = new StringBuilder();

        System.out.println("Please enter your full name"); // would I be able to just say append this user input variable?
        String userName = scanner.nextLine();
        // billing address request
        System.out.println("Billing Address\n"+"------------------------\n"+"Please enter your Billing Street Address");
        String billStreet = scanner.nextLine();
        customerInfo.append(billStreet).append("\n"); // I can append using the user input variables
        System.out.println("Please enter your Billing City");
        String billCity = scanner.nextLine();
        customerInfo.append(billCity).append("\n");
        System.out.println("Please enter your Billing State");
        String billState = scanner.nextLine();
        customerInfo.append(billState).append("\n");
        System.out.println("Please enter your Billing Zip Code");
        String billZip = scanner.nextLine();
        customerInfo.append(billZip).append("\n"); // I am able to make another append to make it print to next line

        // shipping address request
        System.out.println("Shipping Address\n"+"------------------------\n"+"Please enter your Billing Street Address");
        String shipStreet = scanner.nextLine();
        shippingInfo.append(shipStreet).append("\n"); // I can append using the user input variables
        System.out.println("Please enter your Shipping City");
        String shipCity = scanner.nextLine();
        shippingInfo.append(shipCity).append("\n");
        System.out.println("Please enter your Shipping  State");
        String shipState = scanner.nextLine();
        shippingInfo.append(shipState).append("\n");
        System.out.println("Please enter your Shipping Zip Code");
        String shipZip = scanner.nextLine();
        shippingInfo.append(shipZip).append("\n");


        // likely want to make 2 string builders one for billing and shipping
        // ask matt if I could do the same with one builder

        String fullAddress = customerInfo.toString();
        System.out.println(userName);
        System.out.println("--------------------");
        System.out.println("Billing Address: \n" + fullAddress);
        System.out.println("Shipping Address: \n" + shippingInfo);


        /*
         Testing: Outputted this 107 Ivy GroveFloral BoulevardTexas109773
         Solution .append(variable).append("\n"); - using this allowed me to add the users input and form a new line

         */
    }
}
