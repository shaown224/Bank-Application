import java.sql.Date;
import java.util.Scanner;

public class BankAccountDetails {

    private String accountHolderName;
    String accountNumber;
    private String accountType;
    private Date accountCreatedDate;
    private double accountBalance;
    Scanner scanner = new Scanner(System.in);

    public void createNewAccount() {
        System.out.print("Account Holder Name: ");
        accountHolderName = scanner.nextLine();
        System.out.print("Account Number: ");
        accountNumber = scanner.nextLine();
        System.out.print("Account Type: ");
        accountType = scanner.nextLine();
        System.out.print("Account Created Date (yyyy-mm-dd): ");
        accountCreatedDate = Date.valueOf(scanner.nextLine());
        System.out.print("Account Balance: ");
        accountBalance = scanner.nextDouble();
        scanner.nextLine();
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public Date getAccountCreatedDate() {
        return this.accountCreatedDate;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void showAccount() {
        System.out.println("Name of account holder: " + accountHolderName);
        System.out.println("Account no.: " + accountHolderName);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + accountCreatedDate);
        System.out.println("Balance: " + accountBalance);
    }

    public void DisplayAllAccount() {

    }

}
