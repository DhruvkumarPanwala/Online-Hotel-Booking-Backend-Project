package com.dhruvhotelbooking.onlinehotelbookingproject.exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
