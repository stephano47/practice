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
        books[0] = new Book(10223, " 978-1-60309-344-6", "The Fun Family", false, "");
        books[1] = new Book(10224, "978-1-60309-505-1", "Free Pass", false, "");
        books[2] = new Book(10225, "978-1-60309-558-7", "Ionheart", false, "");
        books[3] = new Book(10226, "978-1-60309-546-4", "Dreamover", false, "");
        books[4] = new Book(10227, "978-1-60309-574-7", "It Rhymes With Takei", false, "");
        books[5] = new Book(10228, "978-0-930289-23-3", "Watchmen", true, "Ethan Parker");
        books[6] = new Book(10229, "978-0-451-16951-8", "It", false, "");
        books[7] = new Book(10230, "978-0-441-17271-9", "Dune", true, "Lila Montgomery");
        books[8] = new Book(10231, "978-0-14-143958-7", "Emma", false, "");
        books[9] = new Book(10232, "978-0-385-08486-7", "Jaws", true, "Rob Parker");
        books[10] = new Book(10233, "978-1-4000-3341-6", "Beloved", false, "");
        books[11] = new Book(10234, "978-0-374-37152-4", "Speak", false, "");
        books[12] = new Book(10235, "978-0-06-144878-2", "Gone", false, "");
        books[13] = new Book(10236, "978-1-4215-2211-9 ", "One Piece", false, "");
        books[14] = new Book(10237, "978-1-64651-654-4", "Blue Lock Volume 1", false, "");
        books[15] = new Book(10238, "978-4-06-535506-0", "Blue Lock, Volume 29", true, "Adrian Bennett");
        books[16] = new Book(10239, "978-1-93565-489-6", "Mobile Suit Gundam: The Origin, Volume 3: Ramba Ra", true, "Naomi Spencer");
        books[17] = new Book(10240, "978-0-440-21225-2", "Outlander", false, "");
        books[18] = new Book(10241, "978-0-14-241037-0", "Matilda", false, "");
        books[19] = new Book(10242, "978-0-679-72276-2", "Ulysses", false, "");

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
                // Asking user to type in the ID of the book to check out
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
                // Asking user to type in the ID of the book to check in
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

