package com.techmesckills.task_2.verification;

import com.techmesckills.task_2.exception.WrongPasswordException;
import com.techmesckills.task_2.util.IConstant;

import java.util.Arrays;

public class VerificationPassword {

    public static void checkPasswordUser(String password, String confirmPassword) throws WrongPasswordException {

        // to check password of user
        char[] passwordUser = password.toCharArray();
        boolean numberSymbolPassword = false;
        for (char i : passwordUser) {
            if (passwordUser.length > IConstant.MAX_COUNT_PASSWORD) {
                throw new WrongPasswordException("Your login exceeds more than twenty symbols");
            }if (i == ' ') {
                throw new WrongPasswordException("Your password contains interword space");
            }if (i >= 48 && i <= 57) {
                numberSymbolPassword = true;
            }
        }
        if (!numberSymbolPassword) {
            throw new WrongPasswordException("Your password must contain at least one digit");
        }
        if (passwordUser.length > IConstant.MAX_COUNT_PASSWORD) {
            throw new WrongPasswordException("Your login exceeds more than twenty symbols");
        }
        // to compare password with confirmPassword
        char[] confPasswordUser = confirmPassword.toCharArray();
        if (!Arrays.equals(confPasswordUser, passwordUser)) {
            throw new WrongPasswordException("Incorrect confirmPassword,try it again ");
        }
    }
}
