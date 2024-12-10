
public class Book {
    private final String title;
    private final String author;
    private final int year;
    private boolean isAvailable = true;

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 2024;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void borrowBook(){
        this.isAvailable = false;
    }

    public void returnBook() {
        this.isAvailable = true;
    }

    public void displayInfo() {
        System.out.printf("Book information:\n\tTitle - %s\n\tAuthor - %s\n\tYear - %d\n\t%s for issue%n",
                title, author, year, isAvailable ? "Available" : "Unavailable");
    }
}
