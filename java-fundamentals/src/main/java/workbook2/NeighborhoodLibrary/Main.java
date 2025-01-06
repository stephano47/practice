package workbook2.NeighborhoodLibrary;
import java.util.*;

public class Main {
    // from what was told have 20 books at least
    static Book[] books = new Book[20];

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        bookList();

        // Home Menu--
        do {
            System.out.println("Welcome to the Neighborhood Library!\n" +
                    "---------------------------------------------\n" +
                    "What Would You Like to do?\n" +
                    "1: Show Availabe Books\n" +
                    "2: Show Checked out Books\n" +
                    "3: Exit");
            int homeInput = scanner.nextInt();
            switch (homeInput) {
                case 1:
                    displayAvailableBooks();
                    break;
                case 2:
                    checkedOutBooks();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);

    }

    public static void bookList() {
        books[0] = new Book(10223, "2230001", "Test Book", false, "");
        books[1] = new Book(10222, "test1", "book 2", false, "");
        books[2] = new Book(10242, "test2", "book 3", false, "");
        books[3] = new Book(10242, "test3", "book 4", false, "");
        books[4] = new Book(10242, "test1", "book 5", false, "");
        books[5] = new Book(10242, "test1", "book 6", true, "Tim");
        books[6] = new Book(10242, "test1", "book 7", false, "");
        books[7] = new Book(10242, "test1", "book 8", false, "");
        books[8] = new Book(10242, "test1", "book 9", false, "");
        books[9] = new Book(10242, "test1", "book 10", true, "Rob");
        books[10] = new Book(10242, "test1", "book 11", false, "");
        books[11] = new Book(10242, "test1", "book 12", false, "");
        books[12] = new Book(10242, "test1", "book 13", false, "");
        books[13] = new Book(10242, "test1", "book 14", false, "");
        books[14] = new Book(10242, "test1", "book 15", false, "");
        books[15] = new Book(10242, "test1", "book 16", false, "");
        books[16] = new Book(10242, "test1", "book 17", false, "");
        books[17] = new Book(10242, "test1", "book 18", false, "");
        books[18] = new Book(10242, "test1", "book 19", false, "");
        books[19] = new Book(10242, "test1", "book 20", false, "");

    }

    // Available Books Menu

    public static void displayAvailableBooks() {
        int bookCount = 20;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isCheckedOut() == !true) {
                System.out.println(books[i].displayAvailableBooks());

            }

        }
        System.out.println("What would you like to do?\n" +
                "1: Checkout a Book\n" +
                "2: Exit");
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                // Asking user to type in the ID of the book to checkout
                System.out.println("Please type in the ID of the book you wish to checkout:");
                int bookID = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                // Loop through the books to find the selected one
                for (int i = 0; i < bookCount; i++) {
                    if (books[i].getId() == bookID && !books[i].isCheckedOut()) {
                        System.out.println("The book you entered is \"" + books[i].getTitle() + "\"." +
                                " Is this the book you wish to checkout?\n" +
                                "- Yes\n" +
                                "- No");
                        String checkoutChoice = scanner.nextLine();

                        // If user confirms, checkout the book
                        if (checkoutChoice.equalsIgnoreCase("Yes")) {
                            System.out.println("Please enter your name");
                            String name = scanner.nextLine();
                            books[i].setCheckedoutTo(name);
                            books[i].setCheckedOut(true);// Mark book as checked out

                            System.out.println("You have successfully checked out \"" + books[i].getTitle() + "\".");
                        } else {
                            System.out.println("Checkout canceled.");
                        }
                        break;
                    }
                }
                break;

            case 2:
                return; // Exit the method

            default:
                System.out.println("Invalid choice. Please try again.");
        }


        // Must Display all Books in array
        // User Should be given the option to check out any books that are available
        // making an if else and a loop to allow both selection 1 and to be applied through the same class.

    }

    public static void checkedOutBooks(){
        int bookCount = 20;
        for (int i=0; i < bookCount; i++){
            if(books[i].isCheckedOut() == true){System.out.println(books[i].displayCheckedOutBooks());}
        }
        System.out.println("What would you like to do?\n" +
                "1: Check-in a Book\n"+
                "2: Exit");
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                // Asking user to type in the ID of the book to checkout
                System.out.println("Please type in the ID of the book you wish to Check-In:");
                int bookID = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                // Loop through the books to find the selected one
                for (int i = 0; i < bookCount; i++) {
                    if (books[i].getId() == bookID && books[i].isCheckedOut()) {
                        System.out.println("The book you entered is \"" + books[i].getTitle() + "\"." +
                                " Is this the book you wish to check in?\n" +
                                "- Yes\n" +
                                "- No");
                        String checkoutChoice = scanner.nextLine();

                        // If user confirms, checkout the book
                        if (checkoutChoice.equalsIgnoreCase("Yes")) {
                            books[i].setCheckedoutTo("");
                            books[i].setCheckedOut(false);// Mark book as checked in

                            System.out.println("You have successfully checked in \"" + books[i].getTitle() + "\".");
                        } else {
                            System.out.println("Checkout canceled.");
                        }
                        break;
                    }
                }
                break;

            case 2:
                return; // Exit the method

            default:
                System.out.println("Invalid choice. Please try again.");
        }

    }





























    }

