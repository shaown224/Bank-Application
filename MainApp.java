import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * main
 */
public class MainApp {
    public static void main(String[] args) {
        List<BankAccountDetails> accounts = new ArrayList<>();
        System.out.println("Welcome to our Bank. Please Select an option for getting your desired services");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create a new account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Update an account");
            System.out.println("4. Delete an account");
            System.out.println("5. Deposit an amount into your account");
            System.out.println("6. Withdraw an amount from your account");
            System.out.println("7. Search for an account");
            System.out.println("8. Exit");
            System.out.print("Select a service: ");

            int userSelectedOption = scanner.nextInt();
            scanner.nextLine();
            switch (userSelectedOption) {
                case 1:
                    BankAccountDetails newAccount = new BankAccountDetails();
                    newAccount.createNewAccount();
                    accounts.add(newAccount);
                    break;
                case 2:
                    System.out.println("Display all accounts");
                    System.out.println("---------------------------------");
                    for (BankAccountDetails account : accounts) {
                        System.out.println("Account Holder: " + account.getAccountHolderName());
                        System.out.println("Account Number: " + account.getAccountNumber());
                        System.out.println("Account Type: " + account.getAccountType());
                        System.out.println("Account Created Date: " + account.getAccountCreatedDate());
                        System.out.println("Account Balance: " + account.getAccountBalance());
                        System.out.println("---------------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Update an account");
                    break;
                case 4:
                    System.out.println("Delete an account");
                    break;
                case 5:
                    System.out.println("Deposit an amount into your account");
                    break;
                case 6:
                    System.out.println("Withdraw an amount from your account");
                    break;
                case 7:
                    System.out.println("Search for an account");
                    break;
                case 8:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Kindly select a valid input from provided options.");
                    break;
            }
        }

    }
}