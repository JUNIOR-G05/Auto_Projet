package com.example.auto.exceptions.jwt;

public class TokenExpireException extends RuntimeException {
    public TokenExpireException(String msg) {
        super(msg);
    }
}
