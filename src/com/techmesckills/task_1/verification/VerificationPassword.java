package com.techmesckills.task_1.verification;

import com.techmesckills.task_1.exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificationPassword {
    public static final int PASSWORD_LENGTH = 20;

    public static void doCheckPassword(String password, String confirmPassword) throws WrongPasswordException {


        if (password.length() >= PASSWORD_LENGTH) {
            throw new WrongPasswordException("Length of your password can't be more than 20 symbol");
        }

        if (password.isBlank()) {
            throw new WrongPasswordException("Your password contains empty space");
        }
        if (password.contains(" ")) {
            throw new WrongPasswordException("Your password contains interword space");
        }

        if (!password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password must contain at least one digit");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Inappropriate confirmPassword,try it again");
        }
    }
}
