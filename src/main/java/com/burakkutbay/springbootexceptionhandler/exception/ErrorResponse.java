package com.burakkutbay.springbootexceptionhandler.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * /**
 *
 * @author : Burak KUTBAY
 * Date    : 30.11.2021
 */
@AllArgsConstructor
@Getter
@Setter
public class ErrorResponse {
    private String message;
    private List<String> details;
}
