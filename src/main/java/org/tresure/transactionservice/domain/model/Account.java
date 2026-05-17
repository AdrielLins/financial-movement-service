package org.tresure.transactionservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.tresure.transactionservice.domain.enums.AccountStatus;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Account {

    private final UUID id;
    private final String document;
    private final AccountStatus status;
}
