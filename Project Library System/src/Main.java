import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select from the following options:");
        while (true) {

            System.out.printf(
                "1. Add a book\n" +
                "2. Show all books\n" +
                "3. Search for a book\n" +
                "4. Borrow a book\n" +
                "5. Return a book\n" +
                "6. Exit\n"
            );

            int userInput = scanner.nextInt();

            switch(userInput) {
                case 1 -> System.out.println("Make an addBook method plz"); //Change Later
                case 2 -> System.out.println("Make a showBook method plz"); //Change Later
                case 3 -> System.out.println("Make a search method plz"); //Change Later
                case 4 -> System.out.println("make a borrow method plz"); //Change Later
                case 5 -> System.out.println("make a return/update borrow method(s) plz"); //Change Later
                case 6 -> System.out.println("Thank you!");
                default -> System.out.println("Incorrect input; try again.");

            }
            if (userInput == 6) {
                break;
            }

        }
    }
}