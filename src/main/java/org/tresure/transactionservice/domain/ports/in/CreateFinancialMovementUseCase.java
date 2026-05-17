package org.tresure.transactionservice.domain.ports.in;

import org.tresure.transactionservice.application.command.CreateFinancialMovementCommand;
import org.tresure.transactionservice.domain.model.FinancialMovement;

public interface CreateFinancialMovementUseCase {

    FinancialMovement create(CreateFinancialMovementCommand command);
}
