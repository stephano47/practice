package workbook1.mathApp;

public class circleArea {
    public static void main(String[] args) {
        // Define the radius
        double radius = 7.25;

        // Define the approximate value of π
        double pi = 3.14159;

        // Calculate the area using the formula: Area = π * r^2
        double area = pi * radius * radius;

        // Output the result
        System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);
    }
}
