package com.netocalegari.webservicespringboot.services.exception;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg) {
        super(msg);
    }
}
