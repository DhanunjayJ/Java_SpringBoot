package com.dj.ui;
import java.util.Scanner;

public class ConsoleMenu {
    private Scanner scanner;

    public ConsoleMenu(){
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        boolean running = true;

        System.out.println("==== WELCOME TO DJ BANK ====");

        while(running){
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Registration logic coming soon...");
                    break;
                case "2":
                    System.out.println("Login logic coming soon...");
                    break;
                case "3":
                    System.out.println("Thank you for using DJ Bank. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
