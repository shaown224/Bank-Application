import java.sql.Date;
import java.util.Scanner;

public class BankAccountDetails extends MainApp {

    protected String accountHolderName;
    protected String accountNumber;
    protected String accountType;
    protected Date accountCreatedDate;
    protected double accountBalance;
    Scanner scanner = new Scanner(System.in);

    public void createNewAccount(String accountType) {
        this.accountType = accountType;
        System.out.print("Account Holder Name: ");
        this.accountHolderName = scanner.nextLine();
        System.out.print("Account Number: ");
        this.accountNumber = scanner.nextLine();
        System.out.print("Account Created Date (yyyy-mm-dd): ");
        this.accountCreatedDate = Date.valueOf(scanner.nextLine());
        System.out.print("Account Balance: ");
        this.accountBalance = scanner.nextDouble();
        scanner.nextLine();
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountCreatedDate(Date accounCreatedDate) {
        this.accountCreatedDate = accounCreatedDate;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
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

}
