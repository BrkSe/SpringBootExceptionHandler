package com.burakkutbay.springbootexceptionhandler.exception;

/**
 * @author : Burak KUTBAY
 * Date    : 28.11.2021
 */
public class CustomerNotFoundException extends RuntimeException{

    public CustomerNotFoundException(String message){
        super(message);
    }
}
