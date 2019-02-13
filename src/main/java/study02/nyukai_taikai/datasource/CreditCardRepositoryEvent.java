package study02.nyukai_taikai.datasource;

import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.credit_card.CreditCard;
import study02.nyukai_taikai.domain.credit_card.CreditCardExpirationDate;
import study02.nyukai_taikai.domain.credit_card.CreditCardNumber;
import study02.nyukai_taikai.domain.credit_card.CreditCardRepository;
import study02.nyukai_taikai.domain.credit_card.CreditCardSecurityCode;

@Repository
public class CreditCardRepositoryEvent implements CreditCardRepository {

    public CreditCard create() {
        return new CreditCard(
                new CreditCardNumber("1"),
                new CreditCardExpirationDate("1"),
                new CreditCardSecurityCode("1")
        );
    }
}
