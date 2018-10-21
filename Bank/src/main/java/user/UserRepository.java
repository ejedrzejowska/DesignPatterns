package user;

import account.BankAccount;
import account.card.factory.CardFactory;
import account.card.type.CreditCardType;

import java.util.HashMap;

public class UserRepository {
    private static UserRepository instance; //= new UserRepository();// => lazy singleton method
    private static HashMap<String, User> users;

    public static UserRepository getInstance() {
        //return instance; //-> lazy method
        if (instance == null) {
            synchronized (UserRepository.class) { //wypozyczanie klasy na wylacznosc, inny uzytkownik nie moze w tej chwili korzystac z danej klasy
                if (instance == null) {
                    instance = new UserRepository(); // -> eager method, na żądanie, bezpieczne dla wielu watkow
                }
            }
        }
        return instance;
    }

    private UserRepository() {
        CardFactory cardFactory = new CardFactory();
        users = new HashMap<>();
//        BankAccount bankAccountOne = new BankAccount("111111111111111122222222", "1010", "Safety BANK",
//                "John Account1010", 0.0, null, false, null, null, true);
//        BankAccount bankAccountTwo = new BankAccount("333333333333333344444444", "2020", "safety BANK",
//                "Andreas Account2020", 0.0, null, false, null, null, false);

//        BankAccount bankAccountThree = new BankAccount("333333333333333344444445", "3030", "safety BANK",
//                "Bob Account3030", 0.0, 700.0, true, null, null, true);
        BankAccount bankAccountOne = BankAccount.builder("111111111111111122222222")
                .addCreditCard(cardFactory.createCreditCard(CreditCardType.VISA, "Visa1010", "Feb2020",500.0))
                .addAccountCode("1010")
                .addBalance(3000.0)
                .addAccountName("John Account1010")
                .addBankName("Safety BANK")
                .build();

        BankAccount bankAccountTwo = BankAccount.builder("333333333333333344444444")
                .addCreditCard(cardFactory.createCreditCard(CreditCardType.MASTER_CARD, "MasterCard2020", "Feb2020",500.0))
                .addAccountCode("2020")
                .addAccountName("Bob Account2020")
                .addBankName("Safety BANK")
                .build();

        BankAccount bankAccountThree = BankAccount.builder("333333333333333344444445")
                .addCreditCard(cardFactory.createCreditCard(CreditCardType.AMERICAN_EXPRESS, "AmEx3030", "Feb2020",500.0))
                .addAccountCode("3030")
                .addAccountName("Andreas Account3030")
                .addBankName("Safety BANK")
                .addDailyLimit(300)
                .build();


        User userOne = new User("John Kowalski", bankAccountOne);
        User userTwo = new User("Bob Badura", bankAccountTwo);
        User userThree = new User("Andreas Nowak", bankAccountThree);

        users.put(userOne.getFullName(), userOne);
        users.put(userTwo.getFullName(), userTwo);
        users.put(userThree.getFullName(), userThree);
    }

    public HashMap<String, User> getUsers(){
        return users;
    }
}
