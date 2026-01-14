package org.example.structural.patterns.proxy;

// Real subject that does the expensive work.
public class RealCoverImage implements CoverImage {
    private final String filename;

    public RealCoverImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
