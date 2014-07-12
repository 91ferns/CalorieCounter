package com.projectferns.caloriecounterapp.utils;

/**
 * Created by stephen on 7/12/14.
 */
public class Validator {

    public static boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    public static boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

}
