package home_work_1;

public class Main {
    public static void main(String[] args) {

        // 5.1 Создайте несколько книг с использованием разных конструкторов.
        Book book1 = new Book("home_work_1.Book 1", "Julian");
        Book book2 = new Book("home_work_1.Book 2", "Aston");
        Book book3 = new Book("home_work_1.Book 3", "Oscar", 2000, false);
        Book book4 = new Book("home_work_1.Book 4", "Julian", 2024, false);

        // 5.2 Добавьте их в библиотеку.
        Library library = Library.getLibrary();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // 5.3 Выведите доступные книги.
        library.printAvailableBooks();

        // 5.4 Возьмите одну книгу, измените ее статус и снова выведите доступные книги.
        book3.returnBook();
        book2.borrowBook();
        library.printAvailableBooks();

        // Возьмите книги по автору
        library.findBooksByAuthor("Julian");
    }
}