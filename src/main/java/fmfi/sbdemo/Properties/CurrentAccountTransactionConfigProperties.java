package fmfi.sbdemo.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("app.current-account.transaction")
public record CurrentAccountTransactionConfigProperties(
        @DefaultValue("20") int getLatestCurrentAccountTransactionsMaxRecordCount
) { }

