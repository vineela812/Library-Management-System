public class Book {
    private int id;
    private String title;
    private String author;
    private Integer borrowerId; // null if not borrowed

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.borrowerId = null;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Integer borrowerId) {
        this.borrowerId = borrowerId;
    }

    public boolean isAvailable() {
        return borrowerId == null;
    }

    @Override
    public String toString() {
        return "Book [ID=" + id +
                ", Title=" + title +
                ", Author=" + author +
                ", BorrowedBy=" + (borrowerId == null ? "None" : borrowerId) + "]";
    }
}
