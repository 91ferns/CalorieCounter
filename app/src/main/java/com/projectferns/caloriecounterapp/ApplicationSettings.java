package com.projectferns.caloriecounterapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * Created by stephen on 7/12/14.
 */
public class ApplicationSettings {

    private static boolean isInit = false;
    private final Context context;
    private final SharedPreferences storage;

    public final static String SETTINGS_KEY = "com.projectferns.caloriecounterapp.USER_DATA";

    public ApplicationSettings(Context context) {
        this.context = context;
        this.storage = context.getSharedPreferences(SETTINGS_KEY,0);
    }

    private Editor getEditor() {
        return storage.edit();
    }

    /*
     * Set cached versions of the settings
     */

    private String firstName;
    private String lastName;
    private String email;
    private String apiKey;

    private void fetchFirstName() {
        firstName = storage.getString("USER_FIRST_NAME", "");
    }

    public String getUserFirstName() {
        if (firstName == null) fetchFirstName();
        return firstName;
    }

    public void setFirstName(String firstName) {
        getEditor().putString("USER_FIRST_NAME", firstName).commit();
        this.firstName = firstName;
    }

    public boolean getIsUserLoggedIn() {
        return storage.getBoolean("USER_IS_LOGGEDIN", false);
    }

    public void setIsUserLoggedIn(boolean b) {
        getEditor().putBoolean("USER_IS_LOGGEDIN", b).commit();
    }

}
