package org.example.structural.patterns.proxy;

// Proxy delays the creation of the real image until needed.
public class CoverImageProxy implements CoverImage {
    private final String filename;
    private RealCoverImage realImage;

    public CoverImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealCoverImage(filename);
        }
        realImage.display();
    }
}
