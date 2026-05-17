package org.tresure.transactionservice.application.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.tresure.transactionservice.application.command.CreateFinancialMovementCommand;
import org.tresure.transactionservice.domain.model.FinancialMovement;
import org.tresure.transactionservice.domain.ports.in.CreateFinancialMovementUseCase;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateFinancialMovementService implements CreateFinancialMovementUseCase {

    @Override
    public FinancialMovement create(CreateFinancialMovementCommand command) {

        return new FinancialMovement(
            UUID.randomUUID(),
            command.accountId(),
            command.amount(),
            command.type(),
            LocalDateTime.now()
        );
    }
}
