package com.example.transaction.exceptions;

public class NoAccountFoundException extends RuntimeException {

    public NoAccountFoundException(String message){
        super(message);
    }
}
