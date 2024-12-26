package home_work_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        List<Book> books1 = Arrays.asList(
                new Book("Book 1", "Julian", 500, 2000),
                new Book("Book 2", "Julian", 400, 2002),
                new Book("Book 3", "William", 600, 1800),
                new Book("Book 4", "Arnold", 500, 2010),
                new Book("Book 5", "Jack", 100, 1999)
        );

        List<Book> books2 = Arrays.asList(
                new Book("Book 6", "Olaf", 450, 2011),
                new Book("Book 7", "Dima", 350, 2010),
                new Book("Book 8", "Harry", 550, 2001),
                new Book("Book 9", "Olaf", 450, 2022),
                new Book("Book 10", "Ron", 200, 2024)
        );

        Student student1 = new Student("Rick", books1);
        Student student2 = new Student("Ben", books2);
        students.add(student1);
        students.add(student2);

        students.stream()
                .peek(System.out::println)
                .map(Student::getBooks)
                .flatMap(List::stream)
                .sorted()
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(year -> System.out.println("Year of publication: " + year),
                        () -> System.out.println("No book"));

    }
}
