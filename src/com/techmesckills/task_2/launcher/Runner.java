package com.techmesckills.task_2.launcher;

import com.techmesckills.task_2.verification.VerificationDataUser;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your login");
        String login = scanner.nextLine();
        System.out.println("Input your password");
        String password = scanner.nextLine();
        System.out.println("Confirm your password");
        String confirmPassword = scanner.nextLine();

        if (VerificationDataUser.checkVerificationDataUser(login, password, confirmPassword)) {
            System.out.println("it's correct data of user");
        } else {
            System.out.println("it's incorrect data of user");
        }
    }
}
