package account.card;

import account.card.type.CreditCardType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class CreditCard {
    private CreditCardType creditCardType;
    private String number;
    private String expirationDate;
    private double balance;
    private double maxCredit;

    public abstract void showCardDetails();

}
