package com.techmesckills.task_1.verification;

import com.techmesckills.task_1.exception.WrongPasswordException;

public class VerificationPassword {
    public static final int PASSWORD_LENGTH = 20;
    public static void doCheckPassword(String password, String confirmPassword) throws WrongPasswordException {

        if (password.length() >= PASSWORD_LENGTH) {
            throw new WrongPasswordException("Length of your password can't be more than 20 symbol");
        }

        if (password.isBlank()) {
            throw new WrongPasswordException("Your password contains empty space");
        }

        if (!password.matches("[a-zA-Z]*[0-9]{1}")) { // не получается проверка здесь,выбрасывает исключение всегда
            throw new WrongPasswordException("Password doesn't contain at least one digit");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Inappropriate confirmPassword,try it again");
        }
    }
}
