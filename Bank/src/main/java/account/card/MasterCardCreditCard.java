package account.card;

import account.card.type.CreditCardType;

public class MasterCardCreditCard extends CreditCard{

    public MasterCardCreditCard(CreditCardType creditCardType, String number, String expirationDate, double balance, double maxCredit) {
        super(creditCardType, number, expirationDate, balance, maxCredit);
    }

    @Override
    public void showCardDetails() {
        System.out.println("CreditCardType: " + getCreditCardType());
    }
}
