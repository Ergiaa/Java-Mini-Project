import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Display Menu in a Loop
        int choice = 0;
        do {
            System.out.println("--------- Library Menu---------");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Title");

            System.out.println("4. Borrow Book.");
            System.out.println("5. Return Book.");
            System.out.println("6. Count Borrowed Books by User (Recursive)");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            try {
                // Handle the choice
                // (Call methods in library)
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage()); // Exception Handling
            }
        } while (choice != 0);

        sc.close();
    }
}
