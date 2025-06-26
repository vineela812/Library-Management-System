import java.util.ArrayList;

public class LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public LibrarySystem() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add a new Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Add a new User
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully!");
    }

    // Show all Books
    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    // Show all Users
    public void showAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            for (User u : users) {
                System.out.println(u);
            }
        }
    }

    // Borrow a Book
    public void borrowBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (user == null) {
            System.out.println("User not found.");
        } else if (!book.isAvailable()) {
            System.out.println("Book is already borrowed by User ID: " + book.getBorrowerId());
        } else {
            book.setBorrowerId(userId);
            System.out.println("Book successfully borrowed by User ID: " + userId);
        }
    }

    // Return a Book
    public void returnBook(int bookId) {
        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (book.isAvailable()) {
            System.out.println("This book was not borrowed.");
        } else {
            book.setBorrowerId(null);
            System.out.println("Book successfully returned.");
        }
    }

    // Find Book by ID
    private Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    // Find User by ID
    private User findUserById(int id) {
        for (User u : users) {
            if (u.getId() == id) return u;
        }
        return null;
    }
}
