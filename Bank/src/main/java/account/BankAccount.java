package account;

import account.card.CreditCard;
import account.card.DebitCard;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class BankAccount {
    private String number;
    private String accountCode;
    private String bankName;
    private String accountName;
    private double balance;
    private Double dailyLimit;
    private boolean isBlocked;
    private CreditCard creditCard;
    private List<DebitCard> debitCard;
    private boolean isNewCustomerAccount;

    public BankAccount() {
    }

    public BankAccount(String number, String accountCode, String bankName, String accountName, double balance, Double dailyLimit,
                       boolean isBlocked, CreditCard creditCard, List<DebitCard> debitCard, boolean isNewCustomerAccount) {
        this.number = number;
        this.accountCode = accountCode;
        this.bankName = bankName;
        this.accountName = accountName;
        this.balance = balance;
        this.dailyLimit = dailyLimit;
        this.isBlocked = isBlocked;
        this.creditCard = creditCard;
        this.debitCard = debitCard;
        this.isNewCustomerAccount = isNewCustomerAccount;
    }

    public static BankAccountBuilder builder(String accountNumber){
        return new BankAccountBuilder(accountNumber);
    }

    public static class BankAccountBuilder {
        private String number;
        private String accountCode;
        private String bankName;
        private String accountName;
        private double balance;
        private Double dailyLimit;
        private boolean isBlocked;
        private CreditCard creditCard;
        private List<DebitCard> debitCard;
        private boolean isNewCustomerAccount;

        public BankAccountBuilder(String number){
            this.number = number;
        }

        public BankAccountBuilder addAccountCode(String accountCode){
            this.accountCode = accountCode;
            return this;
        }

//        public BankAccountBuilder addNumber (String number){      -----> will be added as required field BankAccountBuilder Constructor<-----
//            this.number = number;
//            return this;
//        }

        public BankAccountBuilder addBankName(String bankName){
            this.bankName = bankName;
            return this;
        }

        public BankAccountBuilder addAccountName(String accountName){
            this.accountName = accountName;
            return this;
        }

        public BankAccountBuilder addBalance (double balance){
            this.balance = balance;
            return this;
        }

        public BankAccountBuilder addDailyLimit(double dailyLimit){
            this.dailyLimit = dailyLimit;
            return this;
        }

        public BankAccountBuilder addIsBlocked(boolean isBlocked){
            this.isBlocked = isBlocked;
            return this;
        }

        public BankAccountBuilder addCreditCard(CreditCard creditCard){
            this.creditCard = creditCard;
            return this;
        }

        public BankAccountBuilder addDebitCard(List<DebitCard> debitCard) {
            this.debitCard = debitCard;
            return this;
        }

        public BankAccountBuilder addIsNewCustomerAccount(boolean isNewCustomerAccount) {
            this.isNewCustomerAccount = isNewCustomerAccount;
            return this;
        }

        public BankAccount build(){
            BankAccount bankAccount = new BankAccount();
            bankAccount.setAccountCode(this.accountCode);
            bankAccount.setAccountName(this.accountName);
            bankAccount.setBalance(this.balance);
            bankAccount.setBlocked(this.isBlocked);
            bankAccount.setBankName(this.bankName);
            bankAccount.setCreditCard(this.creditCard);
            bankAccount.setDailyLimit(this.dailyLimit);
            bankAccount.setNewCustomerAccount(this.isNewCustomerAccount);
            bankAccount.setDebitCard(this.debitCard);
            return bankAccount;
        }
    }
}
