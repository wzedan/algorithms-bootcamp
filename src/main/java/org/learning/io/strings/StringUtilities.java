package org.learning.io.strings;

import java.util.HashSet;

/**
 * Created by wz on 4/29/17.
 */
public class StringUtilities {

    public static boolean isUnique(String str) {
        if (str.length() > 256) {
            return false;
        }
        HashSet<Character> unique = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!unique.add(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0, j = str2.length() - 1; i < str2.length() && j > -1; i++, j--) {
            if (str1.charAt(i) != str2.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
