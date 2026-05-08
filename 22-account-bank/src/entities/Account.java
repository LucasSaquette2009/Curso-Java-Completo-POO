package entities;

public class Account {
    private static final double TAX = 5.00;
    private final int accountNumber;
    private String holder;
    private double totalValue;

    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public Account(int accountNumber, String holder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String name) {
        this.holder = name;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void deposit(double depositValue) {
        this.totalValue += depositValue;
    }

    public void withdraw(double withdrawValue) {
        this.totalValue -= (withdrawValue + TAX);
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f%n", accountNumber, holder, totalValue);
    }
}
