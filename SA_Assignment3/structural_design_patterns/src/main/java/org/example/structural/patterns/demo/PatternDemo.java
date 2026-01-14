package org.example.structural.patterns.demo;

import org.example.structural.dto.BookDto;
import org.example.structural.entity.Book;
import org.example.structural.patterns.adapter.BookCatalog;
import org.example.structural.patterns.adapter.LegacyCatalogAdapter;
import org.example.structural.patterns.adapter.LegacyCatalogSystem;
import org.example.structural.patterns.composite.BookShelf;
import org.example.structural.patterns.composite.SingleBook;
import org.example.structural.patterns.facade.SimpleLibraryFacade;
import org.example.structural.patterns.proxy.CoverImage;
import org.example.structural.patterns.proxy.CoverImageProxy;
import org.example.structural.service.BestsellerBookDecorator;
import org.example.structural.service.BookDecorator;
import org.example.structural.service.FeaturedBookDecorator;

public class PatternDemo {
    public static void main(String[] args) {
        demoAdapter();
        demoComposite();
        demoDecorator();
        demoFacade();
        demoProxy();
    }

    private static void demoAdapter() {
        System.out.println("\n--- Adapter ---");
        BookCatalog catalog = new LegacyCatalogAdapter(new LegacyCatalogSystem());
        BookDto book = catalog.findBookByIsbn("978-1");
        System.out.println("Found: " + book.getTitle() + " by " + book.getAuthor());
    }

    private static void demoComposite() {
        System.out.println("\n--- Composite ---");
        BookShelf mainShelf = new BookShelf("Main Shelf");
        mainShelf.addItem(new SingleBook("Design Patterns"));

        BookShelf favorites = new BookShelf("Favorites");
        favorites.addItem(new SingleBook("Clean Architecture"));
        favorites.addItem(new SingleBook("Refactoring"));

        mainShelf.addItem(favorites);
        mainShelf.showDetails("");
    }

    private static void demoDecorator() {
        System.out.println("\n--- Decorator ---");
        Book baseBook = new Book(null, "Refactoring", "Martin Fowler", 40.0);
        BookDecorator decorated = new BestsellerBookDecorator(new FeaturedBookDecorator(baseBook));
        System.out.println("Decorated: " + decorated.getDescription() + " | price=" + decorated.getPrice());
    }

    private static void demoFacade() {
        System.out.println("\n--- Facade ---");
        SimpleLibraryFacade facade = new SimpleLibraryFacade();
        facade.borrowBook("Clean Code", "Ana");
        facade.borrowBook("Out of Stock", "Ana");
    }

    private static void demoProxy() {
        System.out.println("\n--- Proxy ---");
        CoverImage image = new CoverImageProxy("cover.jpg");
        image.display();
        image.display();
    }
}
