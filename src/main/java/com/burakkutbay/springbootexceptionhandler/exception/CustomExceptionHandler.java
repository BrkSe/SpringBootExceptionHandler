package com.burakkutbay.springbootexceptionhandler.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : Burak KUTBAY
 * Date    : 27.11.2021
 */
@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<String> customerNotFoundException(CustomerNotFoundException customerNotFoundException) {
        return new ResponseEntity<String>(customerNotFoundException.getMessage(), HttpStatus.BAD_REQUEST);
    }


}
