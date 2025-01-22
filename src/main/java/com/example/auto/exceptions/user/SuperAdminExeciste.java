package com.example.auto.exceptions.user;

public class SuperAdminExeciste extends RuntimeException {
    public SuperAdminExeciste(String message) {
        super(message);
    }
}
