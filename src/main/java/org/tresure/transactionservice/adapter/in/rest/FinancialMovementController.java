package org.tresure.transactionservice.adapter.in.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tresure.transactionservice.adapter.in.rest.mapper.FinancialMovementRestMapper;
import org.tresure.transactionservice.adapter.in.rest.request.CreateFinancialMovementRequest;
import org.tresure.transactionservice.adapter.in.rest.response.FinancialMovementResponse;
import org.tresure.transactionservice.domain.ports.in.CreateFinancialMovementUseCase;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/movements")
public class FinancialMovementController {

    private final CreateFinancialMovementUseCase useCase;
    private final FinancialMovementRestMapper mapper;

    @PostMapping
    public FinancialMovementResponse create(@RequestBody CreateFinancialMovementRequest request) {
        return mapper.toResponse(
            useCase.create(
                mapper.toCommand(request)
            )
        );
    }
}
