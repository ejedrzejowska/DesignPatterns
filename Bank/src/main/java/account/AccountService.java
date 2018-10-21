package account;

import utils.Logger;

public class AccountService {
    public void withdraw(BankAccount sourceBankAccount, double amount) {
        if (amount > 0) {
            if (sourceBankAccount.getBalance() - amount >= 0) {
                sourceBankAccount.setBalance(sourceBankAccount.getBalance() - amount);
                System.out.println("Money withdrawn");
            } else {
                System.out.println("Not sufficient account balance available");
            }
        }
    }

    public void deposit(BankAccount targetBankAccount, double amount) {
        if (amount > 0) {
            targetBankAccount.setBalance(targetBankAccount.getBalance() + amount);
            Logger.getInstance().log("Success");
            System.out.println("Money deposited");
        }
    }
}
