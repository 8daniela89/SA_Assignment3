package org.example.structural.service;

// Adds a simple "featured" tag and a small price bump.
public class FeaturedBookDecorator extends AbstractBookDecorator {
    public FeaturedBookDecorator(BookDecorator book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return book.getDescription() + " (Featured)";
    }

    @Override
    public double getPrice() {
        return book.getPrice() + 2.0;
    }
}
