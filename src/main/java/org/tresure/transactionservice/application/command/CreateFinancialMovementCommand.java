package org.tresure.transactionservice.application.command;

import org.tresure.transactionservice.domain.enums.MovementType;

import java.math.BigDecimal;
import java.util.UUID;

public record CreateFinancialMovementCommand(UUID accountId,
                                             BigDecimal amount,
                                             MovementType type) {
}