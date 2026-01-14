package org.example.structural.patterns.facade;

// Subsystem that knows if a book is available.
public class InventoryService {
    public boolean isAvailable(String title) {
        return !"Out of Stock".equalsIgnoreCase(title);
    }
}
