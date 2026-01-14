package org.example.structural.patterns.facade;

// Subsystem that handles a simple loan action.
public class LoanService {
    public void registerLoan(String title, String user) {
        System.out.println("Loan registered for " + user + ": " + title);
    }
}
