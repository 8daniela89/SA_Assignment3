package org.example.structural.patterns.composite;

import java.util.ArrayList;
import java.util.List;

// Composite node that can hold other library items.
public class BookShelf implements LibraryItem {
    private final String name;
    private final List<LibraryItem> items = new ArrayList<>();

    public BookShelf(String name) {
        this.name = name;
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Shelf: " + name);
        for (LibraryItem item : items) {
            item.showDetails(indent + "  ");
        }
    }
}
