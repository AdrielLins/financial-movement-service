package org.tresure.transactionservice.domain.exception;

public class AccountNodFoundException extends RuntimeException {
    public AccountNodFoundException() {
        super("Account not found");
    }
}
