package org.example.structural.patterns.facade;

// Subsystem that sends a short confirmation.
public class NotificationService {
    public void send(String user, String message) {
        System.out.println("Message to " + user + ": " + message);
    }
}
