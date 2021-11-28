package com.burakkutbay.springbootexceptionhandler.exception;

/**
 * @author : Burak KUTBAY
 * Date    : 28.11.2021
 */
public class CustomerNotNullException extends IllegalArgumentException {
    public CustomerNotNullException(String message){
        super(message);
    }
}
