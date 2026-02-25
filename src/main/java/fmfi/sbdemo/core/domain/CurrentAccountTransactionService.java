package fmfi.sbdemo.core.domain;

import fmfi.sbdemo.Properties.CurrentAccountTransactionConfigProperties;
import fmfi.sbdemo.core.api.*;
import fmfi.sbdemo.core.api.dictionary.*;
import fmfi.sbdemo.core.api.dto.*;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service // register this service as Spring bean
@RequiredArgsConstructor
public class CurrentAccountTransactionService implements GetLatestCurrentAccountTransactionsUseCase {

    private final FindLastCurrentAccountTransactionsByAccountNumberSpi findTransactionsSpi;

    private final CurrentAccountTransactionConfigProperties configProperties;

    @Override
    public CurrentAccountTransactionsDto getLatestCurrentAccountTransactions(String accountNumber) {
        // TODO check logged user permission for account

        return findTransactionsSpi.findLastCurrentAccountTransactionsByAccountNumber(
                /* accountNumber */ accountNumber,
                /* transactionRecordCount */ configProperties.getLatestCurrentAccountTransactionsMaxRecordCount()
        );
    }
}
