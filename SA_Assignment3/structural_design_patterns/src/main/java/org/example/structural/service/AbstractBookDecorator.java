package org.example.structural.service;

// Base decorator keeps a reference to the wrapped book component.
public abstract class AbstractBookDecorator implements BookDecorator {
    protected final BookDecorator book;

    protected AbstractBookDecorator(BookDecorator book) {
        this.book = book;
    }

    @Override
    public String getDescription() {
        return book.getDescription();
    }

    @Override
    public double getPrice() {
        return book.getPrice();
    }
}
