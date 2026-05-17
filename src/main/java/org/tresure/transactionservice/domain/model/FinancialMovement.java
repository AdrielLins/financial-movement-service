package org.tresure.transactionservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.tresure.transactionservice.domain.enums.MovementType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class FinancialMovement {

    private UUID id;
    private UUID accountId;
    private BigDecimal amount;
    private MovementType type;
    private LocalDateTime createdAt;
}