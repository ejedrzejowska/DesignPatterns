package account.card;

import account.card.type.CreditCardType;

public class AmericanExpressCreditCard extends CreditCard {

    public AmericanExpressCreditCard(CreditCardType creditCardType, String number, String expirationDate, double balance, double maxCredit) {
        super(creditCardType, number, expirationDate, balance, maxCredit);
    }

    @Override
    public void showCardDetails() {
        System.out.println("CreditCardType: " + getCreditCardType());
    }
}
