package org.example;

public class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}