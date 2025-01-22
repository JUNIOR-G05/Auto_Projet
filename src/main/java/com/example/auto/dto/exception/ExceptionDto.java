package com.example.auto.dto.exception;

public record ExceptionDto(
                org.springframework.http.HttpStatus code,
                String message) {
}
