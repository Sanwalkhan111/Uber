package com.office.uber.helpers;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class GetCurrentUser {

    private static final String CURRENT_USER_SESSION = "CurrentUser";
   // private static final String DrivingMode = "DrivingMode";
    private static final String UserName = "Name";

    public static String getUserId() {
        if (Helper.isUserAvailable()) {
            return FirebaseAuth.getInstance().getUid();
        }
        return "null";
    }

    public static String getUsersPhoneNum() {
        if (Helper.isUserAvailable()) {
            return Objects.requireNonNull(FirebaseAuth.getInstance().getCurrentUser()).getPhoneNumber();
        }
        return "null";
    }

    public static void signOut() {
        if (Helper.isUserAvailable()) {
            FirebaseAuth.getInstance().signOut();
        }
    }

    public static void setName(Context context, String name) {
        SharedPreferences.Editor sharedPref = context.getSharedPreferences(CURRENT_USER_SESSION,
                Context.MODE_PRIVATE).edit();
        sharedPref.putString(UserName, name);
        sharedPref.apply();
    }

    public static String getName(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(CURRENT_USER_SESSION,
                Context.MODE_PRIVATE);
        return sharedPref.getString(UserName, "");
    }

   /* public static void setDrivingMode(Context context, boolean isDriver) {
        SharedPreferences.Editor sharedPref = context.getSharedPreferences(CURRENT_USER_SESSION,
                Context.MODE_PRIVATE).edit();
        sharedPref.putBoolean(DrivingMode, isDriver);
        sharedPref.apply();
    }

    public static boolean IsDriver(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(CURRENT_USER_SESSION,
                Context.MODE_PRIVATE);
        return sharedPref.getBoolean(DrivingMode, false);
    }*/

}
