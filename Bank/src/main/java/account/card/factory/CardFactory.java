package account.card.factory;

import account.card.AmericanExpressCreditCard;
import account.card.CreditCard;
import account.card.MasterCardCreditCard;
import account.card.VisaCreditCard;
import account.card.type.CreditCardType;

public class CardFactory {
    public CreditCard createCreditCard(CreditCardType creditCardType, String number, String expDate, double maxCredit){
        switch (creditCardType){
            case VISA:
                return new VisaCreditCard(CreditCardType.VISA, number, expDate, maxCredit, maxCredit);
            case MASTER_CARD:
                return new MasterCardCreditCard(CreditCardType.MASTER_CARD,number, expDate, maxCredit, maxCredit);
            case AMERICAN_EXPRESS:
                return new AmericanExpressCreditCard(CreditCardType.AMERICAN_EXPRESS, number, expDate, maxCredit, maxCredit);
        }
        return null;
    }
}
