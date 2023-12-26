package com.techmesckills.task_2.verification;

import com.techmesckills.task_2.exception.WrongLoginException;
import com.techmesckills.task_2.exception.WrongPasswordException;

import static com.techmesckills.task_2.verification.VerificationLogin.checkLoginUser;
import static com.techmesckills.task_2.verification.VerificationPassword.checkPasswordUser;

public class VerificationDataUser {

    public static boolean checkVerificationDataUser(String login, String password, String confirmPassword) {
        try {
            checkLoginUser(login);
            checkPasswordUser(password, confirmPassword);
            return true;
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
