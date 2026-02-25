package fmfi.sbdemo.adapter.persistance;

import fmfi.sbdemo.core.api.dictionary.Money;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class MoneyEmbeddable {
    private java.math.BigDecimal amount;
    private String currency;

    public Money toMoney() {
        return new Money(amount, currency);
    }
}
