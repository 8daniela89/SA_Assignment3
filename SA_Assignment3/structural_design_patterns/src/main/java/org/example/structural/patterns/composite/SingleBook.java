package org.example.structural.patterns.composite;

// Leaf node in the composite structure.
public class SingleBook implements LibraryItem {
    private final String title;

    public SingleBook(String title) {
        this.title = title;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "- Book: " + title);
    }
}
