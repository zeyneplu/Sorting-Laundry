package homework5;
//ZEYNEP USLU

import java.util.Scanner;

public class DresserFrontEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dresser dresser = new Dresser();
        boolean quit = false;

        System.out.println("Welcome to the Dresser Organizer!");

        while (!quit) {
            // Display options for the user
            System.out.println("\nChoose an option:");
            System.out.println("1 - Add Clothes to the Dresser");
            System.out.println("2 - Remove Clothes from the Dresser");
            System.out.println("3 - View Dresser Contents");
            System.out.println("4 - Quit");

            // Get user choice
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1: // Add Clothes
                    Clothing itemToAdd = createClothing(scanner);
                    dresser.add(itemToAdd);
                    break;

                case 2: // Remove Clothes
                    Clothing itemToRemove = createClothing(scanner);
                    dresser.remove(itemToRemove);
                    break;

                case 3: // View Dresser Contents
                    System.out.println("Dresser Contents:");
                    dresser.print();
                    break;

                case 4: // Quit
                    quit = true;
                    System.out.println("Exiting the Dresser Organizer. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }
        }

        scanner.close();
    }

    // Helper method to prompt user for clothing details and create a Clothing instance
    private static Clothing createClothing(Scanner scanner) {
        System.out.print("Enter clothing type (Undergarment, Socks, Stockings, Top, Bottom, Cape): ");
        String type = scanner.nextLine();

        System.out.print("Enter clothing color (Brown, Red, Pink, Black, White, Orange, Green, Blue, Purple, Grey): ");
        String color = scanner.nextLine();

        return new Clothing(type, color);
    }
}