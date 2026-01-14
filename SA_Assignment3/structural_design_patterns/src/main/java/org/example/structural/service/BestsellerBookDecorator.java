package org.example.structural.service;

// Adds a bestseller tag and a slightly bigger price bump.
public class BestsellerBookDecorator extends AbstractBookDecorator {
    public BestsellerBookDecorator(BookDecorator book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return book.getDescription() + " (Bestseller)";
    }

    @Override
    public double getPrice() {
        return book.getPrice() + 4.0;
    }
}
