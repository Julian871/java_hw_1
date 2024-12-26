package home_work_2;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private final String title;
    private final String author;
    private final Integer pageCount;
    private final Integer year;


    public Book(String title, String author, Integer pageCount, Integer year) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(this.pageCount, book.pageCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
