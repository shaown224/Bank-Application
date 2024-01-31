import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
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
                    System.out.print("Enter the account number to update: ");
                    String accountNumberToUpdate = scanner.nextLine();

                    for (BankAccountDetails account : accounts) {
                        if (account.accountNumber.equals(accountNumberToUpdate)) {
                            System.out.print("Enter the new Account Holder Name: ");
                            account.accountHolderName = scanner.nextLine();

                            System.out.print("Enter the new Account Type: ");
                            account.accountType = scanner.nextLine();

                            System.out.print("Enter the new Account Created Date (yyyy-mm-dd): ");
                            account.accountCreatedDate = Date.valueOf(scanner.nextLine());

                            System.out.print("Enter the new Account Balance: ");
                            account.accountBalance = scanner.nextDouble();

                            scanner.nextLine();

                            System.out.println("Account updated successfully.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Delete an account");
                    System.out.print("Enter the account number to delete: ");
                    String accountNumberToDelete = scanner.nextLine();

                    Iterator<BankAccountDetails> iterator = accounts.iterator();
                    while (iterator.hasNext()) {
                        BankAccountDetails account = iterator.next();
                        if (account.accountNumber.equals(accountNumberToDelete)) {
                            iterator.remove(); // Remove the account from the list
                            System.out.println("Account deleted successfully.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Deposit into an account");
                    System.out.print("Enter the account number to deposit into: ");
                    String accountNumberToDeposit = scanner.nextLine();

                    for (BankAccountDetails account : accounts) {
                        if (account.accountNumber.equals(accountNumberToDeposit)) {
                            System.out.print("Enter the amount to deposit: ");
                            double amountToDeposit = scanner.nextDouble();

                            if (amountToDeposit > 0) {
                                account.accountBalance += amountToDeposit;
                                System.out.println("Amount deposited successfully.");
                            } else {
                                System.out.println("Invalid amount. Deposit amount should be greater than 0.");
                            }

                            scanner.nextLine();
                        }
                    }

                    break;
                case 6:
                    System.out.println("Withdraw an amount from your account");
                    System.out.print("Enter the account number to Withdraw from: ");
                    String accountNumberFromWithdraw = scanner.nextLine();

                    for (BankAccountDetails account : accounts) {
                        if (account.accountNumber.equals(accountNumberFromWithdraw)) {
                            System.out.print("Enter the amount withdraw from your current balance: ");
                            double amountToWithDraw = scanner.nextDouble();

                            if (amountToWithDraw < account.accountBalance) {
                                account.accountBalance -= amountToWithDraw;
                                System.out.println("Amount withdraw successfully.");
                            } else {
                                System.out
                                        .println("Invalid amount. With amount should be greater than current balance.");
                            }
                            scanner.nextLine();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Search for an account");
                    System.out.println("Enter your account number");
                    String accountNumber = scanner.nextLine();

                    for (BankAccountDetails account : accounts) {
                        if (account.accountNumber.equals(accountNumber)) {
                            System.out.println("Account Holder: " + account.getAccountHolderName());
                            System.out.println("Account Number: " + account.getAccountNumber());
                            System.out.println("Account Type: " + account.getAccountType());
                            System.out.println("Account Created Date: " + account.getAccountCreatedDate());
                            System.out.println("Account Balance: " + account.getAccountBalance());
                        }
                    }
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