package com.capgi.bank.exception;

import com.capgi.bank.entity.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AccountNotFound.class)
    public ResponseEntity<ErrorResponseDto> handleAccountNotFoundException(AccountNotFound accountNotFound, WebRequest webRequest)
    ErrorResponseDto errorResponseDto = new ErrorResponseDto(webRequest.getDescription(false), HttpStatus.BAD_REQUEST,accountNotFound.getMessage(), LocalDateTime.now());
return new ResponseEntity<>(ErrorResponseDto,HttpStatus.BAD_REQUEST);}