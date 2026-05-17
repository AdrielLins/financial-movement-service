package org.tresure.transactionservice.adapter.in.rest.request;

import org.tresure.transactionservice.domain.enums.MovementType;

import java.math.BigDecimal;
import java.util.UUID;

public record CreateFinancialMovementRequest(UUID accountId,
                                             BigDecimal amount,
                                             MovementType type) {
}
