package com.techmesckills.task_1.verification;

import com.techmesckills.task_1.exception.WrongLoginException;
import com.techmesckills.task_1.exception.WrongPasswordException;

import static com.techmesckills.task_1.verification.VerificationLogin.doCheckLogin;
import static com.techmesckills.task_1.verification.VerificationPassword.doCheckPassword;

public class VerificationUser {

    public static boolean checkVerificationUser(String login,String password,String confirmPassword) {
        try {
            doCheckLogin(login);
            doCheckPassword(password, confirmPassword);
            return true;

        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;

        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
