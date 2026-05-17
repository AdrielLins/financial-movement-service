package org.tresure.transactionservice.adapter.in.rest.mapper;

import org.mapstruct.Mapper;
import org.tresure.transactionservice.adapter.in.rest.request.CreateFinancialMovementRequest;
import org.tresure.transactionservice.adapter.in.rest.response.FinancialMovementResponse;
import org.tresure.transactionservice.application.command.CreateFinancialMovementCommand;
import org.tresure.transactionservice.domain.model.FinancialMovement;

@Mapper(componentModel = "spring")
public interface FinancialMovementRestMapper {

    CreateFinancialMovementCommand toCommand(CreateFinancialMovementRequest request);

    FinancialMovementResponse toResponse(FinancialMovement movement);

}
