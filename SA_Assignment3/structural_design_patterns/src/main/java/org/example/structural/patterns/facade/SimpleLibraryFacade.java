package org.example.structural.patterns.facade;

// Facade hides the steps needed to borrow a book.
public class SimpleLibraryFacade {
    private final InventoryService inventoryService = new InventoryService();
    private final LoanService loanService = new LoanService();
    private final NotificationService notificationService = new NotificationService();

    public void borrowBook(String title, String user) {
        if (!inventoryService.isAvailable(title)) {
            notificationService.send(user, "Book is not available right now.");
            return;
        }
        loanService.registerLoan(title, user);
        notificationService.send(user, "Enjoy your book!");
    }
}
