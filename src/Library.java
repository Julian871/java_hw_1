import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;
    private static final Library library;

    public Library() {
        books = new ArrayList<>();
    }

    static {
        library = new Library();
        System.out.println("Loading books...");
        library.addBook(new Book("Static book 1", "Library"));
        library.addBook(new Book("Static book 2", "Library", 1000, false));
    }

    public static Library getLibrary() {
        return library;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added!");
    }

    public void printAvailableBooks() {
        List<Book> booksList = books.stream()
                .filter(Book::getIsAvailable)
                .toList();

        if (booksList.isEmpty()) {
            System.out.println("\nNo available books");
        } else {
            System.out.println("\n\n\tAvailable books");
            booksList.forEach(Book::displayInfo);
        }
    }

    public void findBooksByAuthor(String author) {
        List<Book> booksList = books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();

        if (booksList.isEmpty()) {
            System.out.println("\nNo matches with author: " + author);
        } else {
            System.out.println("\n\n\tBooks found by author");
            booksList.forEach(Book::displayInfo);
        }
    }
}
