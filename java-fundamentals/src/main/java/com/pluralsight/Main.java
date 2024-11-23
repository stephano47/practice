package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // switch cases
           System.out.println("Choose a number");
           int testSwitch = scanner.nextInt();
        switch (testSwitch){
            case 0 -> System.out.println(0); // Arrow allows me to make code readable as it includes the break method
            case 1 -> System.out.println(1);
        }
    }
}