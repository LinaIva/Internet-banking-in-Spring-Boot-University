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
public class AccountEmbeddable {
    @Column(nullable = false)
    private String iban;
    private String name;
    private String bic;
    private MoneyEmbeddable balance;
}
