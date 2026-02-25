package fmfi.sbdemo.adapter.persistance;

import fmfi.sbdemo.core.api.dictionary.TransactionStatus;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetailEmbeddable {
    private MoneyEmbeddable amount;
    private java.time.LocalDate effectiveDate;
    private String description;
}
