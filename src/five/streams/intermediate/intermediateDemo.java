package five.streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class intermediateDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Fiction", 15.99, 2018, "The Silent Garden"),
                new Book("Science", 22.50, 2020, "Cosmic Wonders"),
                new Book("Fiction", 12.75, 2005, "Echoes in the Rain"),
                new Book("Biography", 18.00, 2022, "A Life in Code"),
                new Book("Technology", 35.90, 2023, "Java Stream Mastery"),
                new Book("Fiction", 14.50, 2018, "The Midnight Library"),
                new Book("Science", 25.99, 2015, "Quantum Realm"),
                new Book("Technology", 40.00, 2023, "Advanced Spring Boot"),
                new Book("Biography", 16.99, 2019, "The Innovator's Journey"),
                new Book("Fiction", 9.99, 1998, "Old Man and the Sea")
                // 1. filtering: books cheaper than 20

        );
        // 1. filtering: books cheaper than 20
        Stream<Book> stream1= books.stream();
        Stream<Book> stream2= stream1.filter(predicate);
        stream2.forEach(System.out::println);
    }
    static Predicate<Book> predicate=new Predicate<Book>() {
        @Override
        public boolean test(Book book) {
            return book.price <20;
        }
    };
}
