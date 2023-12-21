package com.techmesckills.task_1.exception;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
