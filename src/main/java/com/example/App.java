package com.example;

public class App {

    // Defining the constant GREETING_MESSAGE
    public static final String GREETING_MESSAGE = "Hello World!";

    // Method to return the greeting message
    public String getGreeting() {
        return GREETING_MESSAGE;
    }

    // Method to return a personalized welcome message
    public String welcomeMessage(String name) {
        if (name == null) {
            return "Hello, null!";
        } else if (name.isEmpty()) {
            return "Hello, !";
        }
        return "Hello, " + name + "!";
    }

    // Method to run tests (can be modified as needed)
    public void runTests() {
        // You can invoke your unit tests or any specific logic here
        System.out.println("Running tests...");
    }

    // Main method for the application
    public static void main(String[] args) {
        if (args.length > 0 && "test".equals(args[0])) {
            System.out.println("Running tests...");
        } else {
            System.out.println("Welcome to the application!");
        }
    }
}
