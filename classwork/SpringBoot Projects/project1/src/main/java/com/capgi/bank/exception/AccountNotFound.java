package com.capgi.bank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class AccountNotFound extends RuntimeException {
    public AccountNotFound(String exceptionMessage) {

        super(exceptionMessage);
    }
}
