package ru.itis.users.exceptions;

public class EmailValidationException extends RuntimeException {

    public EmailValidationException(String message) {
        super(message);
    }
}
