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

        }codeWars();
    }

    public static  void codeWars(){
                int wholeNumber = 42;

                switch (wholeNumber){
                    case 1:
                        wholeNumber = -1;
                        System.out.println(wholeNumber);
                        break;
                    case 2:
                        wholeNumber = -2;
                        System.out.println(wholeNumber);
                        break;
                    case 3:
                        wholeNumber = -3;
                        System.out.println(wholeNumber);
                        break;
                    case 4:
                        wholeNumber = -4;
                        System.out.println(wholeNumber);
                        break;
                    case 5:
                        wholeNumber = -5;
                        System.out.println(wholeNumber);
                        break;
                    case 6:
                        wholeNumber = -6;
                        System.out.println(wholeNumber);
                        break;
                    case 42 :
                        wholeNumber = -42;
                        System.out.println(wholeNumber);
                        break;

                }

            }


        }

