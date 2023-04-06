package com.isvaso;

import java.util.Locale;

public class IsItPalindrome {

    public static boolean check(int value) {
        String stringValue = String.valueOf(value).toLowerCase(Locale.ROOT);

        if (stringValue.equals("")) {
            return false;
        }

        int j = stringValue.length() - 1;
        int i = 0;

        while (i < j) {
            if (stringValue.charAt(i++) != stringValue.charAt(j--)) {
                return false;
            }
        }

        return true;
    }

    public static boolean check(String value) {
        value = value.toLowerCase();

        int j = value.length() - 1;
        int i = 0;

        while (i < j) {
            if (value.charAt(i++) != value.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}
