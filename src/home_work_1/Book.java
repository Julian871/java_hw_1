package home_work_1;

public class Book {
    private final String title;
    private final String author;
    private final Integer year;
    private Boolean isAvailable;

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
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook(){
        if(!this.isAvailable) {
            System.out.println("This book does not exist");
        } else {
            this.isAvailable = false;
        }
    }

    public void returnBook() {
        if(this.isAvailable) {
            System.out.println("This book is in place");
        } else {
            this.isAvailable = true;
        }
    }

    public void displayInfo() {
        System.out.printf("home_work_1.Book information:\n\tTitle - %s\n\tAuthor - %s\n\tYear - %d\n\t%s for issue%n",
                title, author, year, isAvailable ? "Available" : "Unavailable");
    }
}
