package com.example.naumenwebproject.exception;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(String massage) {
        super(massage);
    }
}
