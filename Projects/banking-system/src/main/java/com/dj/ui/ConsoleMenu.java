package com.dj.ui;
import java.util.Scanner;

import com.dj.model.BankAccount;
import com.dj.model.CurrentAccount;
import com.dj.model.SavingsAccount;
import com.dj.model.User;
import com.dj.repository.AccountRepository;
import com.dj.repository.UserRepository;

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

            UserRepository userRepo = new UserRepository();

            switch (choice) {
                case "1":{
                    System.out.println("Enter usename :");
                    String username = scanner.nextLine();
                    System.out.println("Enter password :");
                    String password = scanner.nextLine();
                    User user = new User(username,password);
                    boolean isRegistered = userRepo.register(user);
                    if(isRegistered){
                        System.out.println("User Succesfully Registered");
                    }else{
                        System.out.println("Unable to Register User");
                    }
                    break;
                }
                case "2": {
                   System.out.println("Enter usename :");
                    String username = scanner.nextLine();
                    System.out.println("Enter password :");
                    String password = scanner.nextLine();
                    User user = userRepo.login(username, password);
                    if(user!=null){
                    System.out.println("SucessFully Logged in!! Welcome, "+ user.getUsername());
                    handleBankingMenu(user);
                    }else{
                        System.out.println("Invaild Credentials");
                    }
                    break;
                }
                case "3":
                    System.out.println("Thank you for using DJ Bank. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void handleBankingMenu(User user) {
       AccountRepository accountRepo = new AccountRepository();

       boolean loggedIn = true;

       while(loggedIn){

        BankAccount account = accountRepo.getAccountByUserId(user.getId());

        if(account == null) {
            System.out.println("\n You don't have an account yet");
            System.out.println("1. Open Savings Account");
            System.out.println("2. Open Current Account");
            System.out.println("3. Logout");

            String choice = scanner.nextLine();

            if(choice.equals("1")){
                boolean isCreated = accountRepo.createAccount(new SavingsAccount(user.getId(),0.0));
                if(isCreated)
                System.out.println("Savings Account Created");
                else System.out.println("Not Created");

            }else if(choice.equals("2")){
                boolean isCreated = accountRepo.createAccount(new CurrentAccount(user.getId(),0.0));
                if(isCreated)
                System.out.println("Current Account Created");
                else System.out.println("Not Created");
                
            }else{
                loggedIn = false;
            }
        }else
        {
            // 2. If account exists, show the Transaction Menu
            System.out.println("\n--- " + account.getAccountType() + " ACCOUNT MENU ---");
            System.out.println("Balance: " + account.getBalance());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Logout");
            System.out.print("Choice: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Deposit logic (Phase 3)");
                    break;
                case "2":
                    System.out.println("Withdraw logic (Phase 3)");
                    break;
                case "3":
                    System.out.println("Transfer logic (Phase 3)");
                    break;
                case "4":
                    loggedIn = false;
                    break;
                }
            }
        }
    }
}
