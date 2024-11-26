package workbook1;
import java.util.Scanner;
public class CarvsTruck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the price of the Car?");
        double carPrice = scanner.nextDouble();
        System.out.println("What is the price of the Truck");
        double truckPrice = scanner.nextDouble();

        double lowestPrice = Math.min(carPrice,truckPrice);
        if (carPrice > truckPrice){
            System.out.println("The truck is the least expensive: "+ lowestPrice);
        } else if (carPrice < truckPrice) {
            System.out.println("The car is the least expensive "+lowestPrice);
        } else if (carPrice == truckPrice) {
            System.out.println("Both of the vehicles are the same price");
        }

    }
}
