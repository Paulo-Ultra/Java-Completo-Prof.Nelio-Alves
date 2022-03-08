package exercise1.entities;

public class BankAccount {

    public static final double TAX = 5.00;

    private int accountNumber;
    private String personName;
    private double balance;

    public BankAccount(int accountNumber, String personName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.personName =  personName;
        deposit(initialDeposit);
    }

    public BankAccount(int accountNumber, String personName) {
        this.accountNumber = accountNumber;
        this.personName = personName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + TAX;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + personName
                + ", Balance: $"
                + String.format("%.2f", balance);
    }
}
