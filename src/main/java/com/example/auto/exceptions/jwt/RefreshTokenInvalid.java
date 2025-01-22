package com.example.auto.exceptions.jwt;

public class RefreshTokenInvalid extends RuntimeException {
    public RefreshTokenInvalid(String message) {
        super(message);
    }
}
