package com.techmesckills.task_1.verification;

import com.techmesckills.task_1.exception.WrongLoginException;

public class VerificationLogin {
    public static final int LIMIT_LENGTH = 20;
    public static void doCheckLogin(String login) throws WrongLoginException {

        // to check if login more than
        if (login.length() >= LIMIT_LENGTH) {
            throw new WrongLoginException("Incorrect login,length more than 20 signs");
        }

        // to check if login contains empty string or space symbol
        if (login.isBlank()) {
            throw new WrongLoginException("Login can't be empty or contain space symbol");
        }
        if (login.contains(" ")) {
            throw new WrongLoginException("Your login contains interword space");
        }
    }
}
