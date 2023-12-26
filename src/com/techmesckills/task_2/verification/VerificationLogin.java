package com.techmesckills.task_2.verification;

import com.techmesckills.task_2.exception.WrongLoginException;
import com.techmesckills.task_2.util.IConstant;

public class VerificationLogin {

    public static void checkLoginUser(String login) throws WrongLoginException {
        char[] logUser = login.toCharArray();
        if (logUser.length > IConstant.MAX_COUNT_LOGIN) {
            throw new WrongLoginException("Your login exceeds more than twenty symbols");
        }
        for (char i : logUser) {
            if (i == ' ') {
                throw new WrongLoginException("Your login contains interword space");
            }
        }
    }
}
