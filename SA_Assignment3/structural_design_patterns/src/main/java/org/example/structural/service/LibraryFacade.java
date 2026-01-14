package org.example.structural.service;


import org.example.structural.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LibraryFacade {

    private final BookService bookService;

    public LibraryFacade(BookService bookService) {
        this.bookService = bookService;
    }

    // Facade method: hides the service + repository details from the caller.
    public Book addBook(Book book) {
        return bookService.addBook(book);
    }

    public List<BookDecorator> getFeaturedBooks() {
        List<Book> allBooks = bookService.getAllBooks();
        List<BookDecorator> featured = new ArrayList<>();
        for (int i = 0; i < allBooks.size(); i++) {
            BookDecorator decorated = new FeaturedBookDecorator(allBooks.get(i));
            if (i == 0) {
                // First book gets two tags, just to show stacked decorators.
                decorated = new BestsellerBookDecorator(decorated);
            }
            featured.add(decorated);
        }
        return featured;
    }
}
