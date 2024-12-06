package workbook2.CellPhoneService;

import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class CellPhoneService {
    public static void main(String []args){
        CellPhone cellPhone = new CellPhone(); // method to use objects in cellPhone Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Cell Phone Service!\n" +"---------------------------------------------\n"+ "Please enter your phones Serial Number\n" + "Note the serial Number should be 7 digits at max");
        int serial = scanner.nextInt();
        scanner.nextLine();
        cellPhone.setSerialNumber(serial); // this will set the serial number for the Cell Phone Class
        System.out.println("What is the model of your Phone?");
        String phoneModel = scanner.nextLine();
        cellPhone.setModel(phoneModel);
        System.out.println("What is your current carrier?");
        String userCarrier = scanner.nextLine();
        cellPhone.setCarrier(userCarrier);
        System.out.println("What is your Phone Number?");
        String userNumber = scanner.nextLine();
        cellPhone.setPhoneNumber(userNumber);
        System.out.println("Finally what is the name of the owner of the phone?");
        String ownerName = scanner.nextLine();
        cellPhone.setOwner(ownerName);

        System.out.println("Phone Information\n"+"----------------------------------");
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Phone Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

        cellPhone.dial();


    }
}
