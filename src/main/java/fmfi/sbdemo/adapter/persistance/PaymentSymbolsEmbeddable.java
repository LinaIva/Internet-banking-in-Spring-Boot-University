package fmfi.sbdemo.adapter.persistance;

import jakarta.persistence.Column;
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
public class PaymentSymbolsEmbeddable {
    @Column(name = "variable_symbol")
    private String variable;
    @Column(name = "specific_symbol")
    private String specific;
    @Column(name = "constant_symbol")
    private String constant;
    private String payerReference;
}
