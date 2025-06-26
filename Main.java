import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Library System Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Show All Books");
            System.out.println("4. Show All Users");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(bId, title, author));
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int uId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    library.addUser(new User(uId, name));
                    break;

                case 3:
                    library.showAllBooks();
                    break;

                case 4:
                    library.showAllUsers();
                    break;

                case 5:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowBookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int borrowUserId = sc.nextInt();
                    library.borrowBook(borrowBookId, borrowUserId);
                    break;

                case 6:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = sc.nextInt();
                    library.returnBook(returnBookId);
                    break;

                case 7:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}
