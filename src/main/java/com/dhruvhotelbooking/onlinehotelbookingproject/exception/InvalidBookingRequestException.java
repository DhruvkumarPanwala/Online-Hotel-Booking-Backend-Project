package com.dhruvhotelbooking.onlinehotelbookingproject.exception;

public class InvalidBookingRequestException extends RuntimeException{
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
