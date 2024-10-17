package io.gocklkatz;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id,
                   String name,
                   Integer pageCount) {

    public static List<Book> books = Arrays.asList(
        new Book(1, "The Hobbit", 310),
        new Book(2, "The Lord of the Rings", 1178),
        new Book(3, "The Silmarillion", 365)
    );

    public static Book getBookById(Integer id) {
        return books.stream()
            .filter(book -> book.id().equals(id))
            .findFirst()
            .orElse(null);
    }
}
