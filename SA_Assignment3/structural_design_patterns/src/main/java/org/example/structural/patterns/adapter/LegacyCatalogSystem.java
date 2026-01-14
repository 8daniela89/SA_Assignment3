package org.example.structural.patterns.adapter;

// Adaptee with an old-style response format.
public class LegacyCatalogSystem {
    public String findBookData(String isbn) {
        // Pretend this comes from an old system: "title|author|price".
        if ("978-1".equals(isbn)) {
            return "Clean Code|Robert C. Martin|30.5";
        }
        return "Unknown|Unknown|0.0";
    }
}
