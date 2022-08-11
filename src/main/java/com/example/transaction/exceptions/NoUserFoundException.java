package com.example.transaction.exceptions;

public class NoUserFoundException extends Exception {

    private final static String ERROR = "User not found";

    public NoUserFoundException() {
        super(ERROR);
    }

}