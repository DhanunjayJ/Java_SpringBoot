package com.dj.ui;
import java.util.List;
import java.util.Scanner;

import com.dj.exception.InsufficientFundsException;
import com.dj.model.BankAccount;
import com.dj.model.CurrentAccount;
import com.dj.model.SavingsAccount;
import com.dj.model.Transaction;
import com.dj.model.User;
import com.dj.service.BankingService;
import com.dj.service.TransactionService;

public class ConsoleMenu {
    private Scanner scanner;

    BankingService bankingService = new BankingService();
    TransactionService transService = new TransactionService();

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
                case "1":{
                    System.out.println("Enter username :");
                    String username = scanner.nextLine();
                    System.out.println("Enter password :");
                    String password = scanner.nextLine();
                    boolean isRegistered = bankingService.registerUser(username, password);
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
                    User user = bankingService.login(username, password);
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

       boolean loggedIn = true;

       while(loggedIn){

        BankAccount account = bankingService.getAccountByUserId(user.getId());

        if(account == null) {
            System.out.println("\n You don't have an account yet");
            System.out.println("1. Open Savings Account");
            System.out.println("2. Open Current Account");
            System.out.println("3. Logout");

            String choice = scanner.nextLine();

            if(choice.equals("1")){
                boolean isCreated = bankingService.createAccount(new SavingsAccount(user.getId(),0.0));
                if(isCreated)
                System.out.println("Savings Account Created");
                else System.out.println("Not Created");

            }else if(choice.equals("2")){
                boolean isCreated = bankingService.createAccount(new CurrentAccount(user.getId(),0.0));
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
            System.out.println("Your Account Id is:"+ account.getId());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Tranaction History");
            System.out.println("5. Logout");
            System.out.print("Choice: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":{
                    System.out.println("Enter the Amount you want to deposit:");
                    try{
                   // This is safer than scanner.nextDouble()
                    Double amount = Double.parseDouble(scanner.nextLine());
                    bankingService.deposit(account, amount);
                    System.out.println("Amount successfully deposited to the account id: " + account.getId());
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                }
                case "2":
                    {
                        System.out.println("Enter the Amount to withdraw:");
                        try{
                            Double amount = Double.parseDouble(scanner.nextLine());
                            bankingService.withdraw(account, amount);

                            System.out.println("Processing your request...");
                            Thread.sleep(1000);
                            System.out.println("\n [ATM] Verifying balance and counting note....");
                            Thread.sleep(1500);
                            System.out.println("[ATM] Counting: 10%... 40%... 80%... 100%...");
                            Thread.sleep(1000);

                            System.out.println("\n *******************************************************");
                            System.out.println(" KR-CHHH........ CHHH...... [Money sounds]    ");
                            Thread.sleep(1000);
                            System.out.println(" Your cash is comming out of the slot!!");
                            Thread.sleep(1000);
                            System.out.println(" TAKE IT!! Don't get Distracted!");
                            System.out.println("***********************************************************");
                        }catch(InsufficientFundsException e){
                            System.err.println("Transaction Declined: "+ e.getMessage());
                        }catch (NumberFormatException e){
                            System.out.println("Please enter a valid numeric amount.");
                        }catch (InterruptedException e){
                            System.out.println("System Error:" + e.getMessage());
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        break;
                    }
                case "3":{
                    System.out.println("Enter Receiver Username :");
                    try{
                        String receiverUsername = scanner.nextLine();
                        System.out.println("Enter amount to Transfer");
                        Double amount = Double.parseDouble(scanner.nextLine());
                        bankingService.tansfer(account, receiverUsername, amount);
                        System.out.println("Amount Sucessfully Transfered");
                    }catch(Exception e){
                        System.out.println("Transfer Unsucessful");
                        e.printStackTrace();
                    }
                    break;
                }
                case "4" :
                    {
                        System.out.println("Enter What Type of Tranactions you want to Retrive");
                        System.out.println("1. All");
                        System.out.println("2. All Deposits");
                        System.out.println("3. All Withdraw");
                        System.out.println("4. Transfer Out");
                        System.out.println("5. Tranfer IN");

                        String input = scanner.nextLine();
                        String type;
                        
                        if(input.equals("1")){
                            type = "ALL";
                        }else if(input.equals("2")){
                            type = "DEPOSIT";
                        }else if(input.equals("3")){
                            type = "WITHDRAWAL";
                        }else if(input.equals("4")){
                            type = "TRANSFER_OUT";
                        }else{
                            type = "TRANSFER_IN";
                        }

                        List<Transaction> history = transService.getFilteredHistory(account.getId(), type);

                        if(history.isEmpty()){
                            System.out.println("No Transactoin Found");
                        }else{
                            history.forEach(System.out::println);
                            System.out.println("Total Volume:"+ transService.calculateTotalVolume(account.getId(),type));
                        }
                        break;
                    }                 
                case "5":
                    loggedIn = false;
                    break;
                }
            }
        }
    }
}
