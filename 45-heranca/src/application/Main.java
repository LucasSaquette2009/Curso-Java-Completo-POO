package application;

import entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {
        BusinessAccount account = new BusinessAccount();

        double amount = 100;
        double amount2 = 50;
        account.deposit(amount);
        account.withdraw(amount2);
        account.setLoanLimit(amount);
    }
}
